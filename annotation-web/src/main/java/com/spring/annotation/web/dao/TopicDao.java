package com.spring.annotation.web.dao;

import com.spring.annotation.web.entity.Topic;
import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/3/26
 */

public interface TopicDao {

    List<Topic> selectAll();

    //批量插入
    int[] batchInert(List<Topic> topics);

    //新增一个
    int insert(Topic topic);

}
