package com.spring.annotation.web.service;

import com.spring.annotation.web.entity.Topic;

import java.util.List;

public interface TopicService {
    List<Topic> queryAll();

    //新增
    void addTopic(Topic topic);

    //批量插入
    int[] batchInsert(List<Topic> topics);
}
