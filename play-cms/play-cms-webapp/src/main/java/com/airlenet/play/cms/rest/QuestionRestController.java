package com.airlenet.play.cms.rest;

import com.airlenet.play.cms.entity.QuestionEntity;
import com.airlenet.play.cms.service.QuestionEntityService;
import com.airlenet.repo.domain.Result;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author airlenet
 * @version 2017-09-13
 */
@Controller
@RequestMapping("/cms/question")
public class QuestionRestController {
    @Autowired
    private QuestionEntityService questionEntityService;

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    @ResponseBody
    public Page<QuestionEntity> doPage(Predicate predicate, Pageable pageable) {
        return questionEntityService.findAll(predicate, pageable);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Result doSave(@ModelAttribute @Valid QuestionEntity question, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return Result.validateError();
        }

        questionEntityService.save(question);

        return Result.success();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST, params = "id")
    @ResponseBody
    public Result delete(@RequestParam(value = "id") QuestionEntity entity) {
        questionEntityService.delete(entity);
        return Result.success();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST, params = "ids")
    @ResponseBody
    public Result batchDelete(@RequestParam(value = "ids") QuestionEntity[] entities) {
        for (QuestionEntity entity : entities) {
            questionEntityService.delete(entity);
        }

        return Result.success();
    }
}
