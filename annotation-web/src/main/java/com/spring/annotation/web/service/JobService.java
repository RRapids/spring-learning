package com.spring.annotation.web.service;

import com.spring.annotation.web.entity.Job;


import java.util.List;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/3/28
 */
public interface JobService {
    List<Job> queryAll();

    //新增
    void addJob(Job job);

    //批量插入
    int[] batchInsert(List<Job> jobs);
}
