package com.spring.annotation.web.dao;

import com.spring.annotation.web.entity.Job;

import java.util.List;

public interface JobDao {

    List<Job> selectAll();
    //批量插入
    int[] batchInert(List<Job> jobs);

    //新增一个
    int insert(Job job);
}
