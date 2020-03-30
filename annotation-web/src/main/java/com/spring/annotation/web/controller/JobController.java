package com.spring.annotation.web.controller;

import com.spring.annotation.web.service.JobService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/3/28
 */
@Controller
@RequestMapping(value = "/")
public class JobController {
    @Resource
    private JobService jobService;

    @GetMapping("/job")
    public String job(Model model) {
        model.addAttribute("jobs", jobService.queryAll());
        return "job";
    }
}
