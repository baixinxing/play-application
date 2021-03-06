package com.airlenet.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping()
public class IndexController extends BaseController {

	@RequestMapping(value = { "", "/", "/index" }, method = RequestMethod.GET)
	public String get(HttpServletRequest request) {
		request.getScheme();
		request.getServerName();
		request.getServerPort();
		request.getContextPath();
		return "/index";
	}

    @RequestMapping(value = {"/template"}, method = RequestMethod.GET)
    public String template() {
        return "/template";
    }
}
