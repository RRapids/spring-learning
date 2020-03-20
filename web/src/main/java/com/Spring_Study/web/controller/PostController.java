package com.Spring_Study.web.controller;

import com.Spring_Study.web.service.PostService;
import com.Spring_Study.web.util.ResponseObject;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/3/20
 */
@RestController
@RequestMapping(value = "post")
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping(value = "/{get}", produces = "application/json; charset=utf-8")
    public String getPost(@PathVariable(value = "get") Integer id) {
        ResponseObject ro = new ResponseObject(1, "成功", postService.get(id));
        return JSON.toJSONString(ro);
    }
}
