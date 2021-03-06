package com.airlenet.play.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.airlenet.play.main.entity.DictEntity;
import com.airlenet.play.main.service.DictEntityService;
import com.querydsl.core.types.Predicate;

@Controller
@RequestMapping("/center/dict")
public class DictController {

    @Autowired
    DictEntityService dictEntityService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String getUsrList() {
        return "classpath:/admin/dict/list";
    }

    @RequestMapping(value = "/page", method = RequestMethod.POST)
    @ResponseBody
    public Page<DictEntity> doPage(Predicate predicate, Pageable pageable) {
        return dictEntityService.findAll(predicate, pageable);
    }
}
