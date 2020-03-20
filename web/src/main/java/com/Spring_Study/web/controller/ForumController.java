package com.Spring_Study.web.controller;


import com.Spring_Study.web.service.ForumService;
import com.Spring_Study.web.util.ResponseObject;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "forum")
public class ForumController {

    @Autowired
    private ForumService forumService;

    @RequestMapping(value = "/list", produces = "application/json; charset=utf-8")
    public String getForums(){
        ResponseObject ro = new ResponseObject(1,"成功",forumService.selectAll());
        return JSON.toJSONString(ro);
    }
}
