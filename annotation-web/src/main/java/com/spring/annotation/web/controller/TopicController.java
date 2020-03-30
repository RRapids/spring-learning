package com.spring.annotation.web.controller;

import com.Spring_Study.web.util.ResponseObject;
import com.alibaba.fastjson.JSONObject;
import com.spring.annotation.web.service.TopicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/3/27
 */
@Controller
@RequestMapping(value = "/")
public class TopicController {
    @Resource
    private TopicService topicService;

    @GetMapping(value = "topics", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getTopics() {
        ResponseObject rs = new ResponseObject(1, "success", topicService.queryAll());
        return JSONObject.toJSONString(rs);
    }

    @GetMapping("/topic")
    public String topic(Model model) {
        model.addAttribute("topics", topicService.queryAll());
        return "topic";
    }
}
