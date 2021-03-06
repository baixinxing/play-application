package com.airlenet.play.main.security;

import com.airlenet.repo.LockedableException;
import com.airlenet.repo.domain.Result;
import com.airlenet.play.main.service.LogEntityService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

//import com.airshiplay.play.util.BrowserUtil;
//import com.airshiplay.play.util.IpUtil;
//import com.airshiplay.play.util.LogUtil;

/**
 * @author airlenet
 * @version 2017-09-12
 */
@ControllerAdvice
public class DefaultExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(DefaultExceptionHandler.class);

    @Autowired
    LogEntityService logEntityService;

    @Autowired
    private ObjectFactory<ObjectMapper> objectMapper;

    /**
     * 没有权限 异常
     * <p/>
     * 后续根据不同的需求定制即可
     */
    @ExceptionHandler({UnauthorizedException.class, UnauthenticatedException.class, AuthorizationException.class})
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ResponseBody
    public Result processUnauthenticatedException(NativeWebRequest request, UnauthorizedException e) {
        logger.error("main", e);
        addLog(e);
        return Result.accessDenide().addProperties("exception", e.getMessage());
    }

    public void addLog(Throwable ex) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//		String browser = BrowserUtil.checkBrowse(request);
//		logEntityService.addLog(browser, OperateType.OTHER, LogLevel.FATAL, IpUtil.getIpAddr(request), LogUtil.getThrowableString(ex));
    }

    @SuppressWarnings("resource")
    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ModelAndView processException(HttpServletRequest request, HttpServletResponse response, Exception e, HandlerMethod handlerMethod) throws HttpMessageNotWritableException, IOException {
        logger.error("main", e);

        ModelAndView mv = new ModelAndView();
        addLog(e);

        ResponseBody responseBodyAnn = AnnotationUtils.findAnnotation(handlerMethod.getMethod(), ResponseBody.class);
        if (responseBodyAnn != null) {
            Result result;
            if (e instanceof LockedableException) {
                result = Result.failure().addProperties("exception", e.getMessage());
            } else if (e instanceof DataIntegrityViolationException && e.getCause().getCause() instanceof SQLException) {// "唯一性约束"，"不能插入空值"，"完整性约束失败"
                SQLException sqlE = (SQLException) e.getCause().getCause();
                if (sqlE.getMessage().contains("Duplicate entry")) {
                    String message = sqlE.getMessage();
                    result = Result.exception().message(message.split("'")[1] + "已存在").addProperties("exception", message.split("'")[1] + "已存在");
                } else {
                    result = Result.exception().addProperties("exception", e.getMessage());
                }
            } else {
                result = Result.exception().addProperties("exception", e.getMessage());
            }
            HttpInputMessage inputMessage = new ServletServerHttpRequest(request);
            List<MediaType> acceptedMediaTypes = inputMessage.getHeaders().getAccept();
            if (acceptedMediaTypes.isEmpty()) {
                acceptedMediaTypes = Collections.singletonList(MediaType.ALL);
            }
            acceptedMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
            MediaType.sortByQualityValue(acceptedMediaTypes);
            HttpOutputMessage outputMessage = new ServletServerHttpResponse(response);
            MappingJackson2HttpMessageConverter httpMessageConverter = new MappingJackson2HttpMessageConverter(objectMapper.getObject());
            Class<?> returnValueType = Result.class;
            for (MediaType acceptedMediaType : acceptedMediaTypes) {
                if (httpMessageConverter.canRead(returnValueType, acceptedMediaType)) {
                    httpMessageConverter.write(result, acceptedMediaType, outputMessage);
                    outputMessage.getBody().close();
                    return mv;
                }
            }
        } else {
            mv.addObject("errorMessage", e.getMessage());
            mv.setViewName("exception");
        }
        return mv;
    }
}
