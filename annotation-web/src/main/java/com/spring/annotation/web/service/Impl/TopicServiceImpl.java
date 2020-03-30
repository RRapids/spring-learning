package com.spring.annotation.web.service.Impl;

import com.spring.annotation.web.dao.TopicDao;
import com.spring.annotation.web.entity.Topic;
import com.spring.annotation.web.service.TopicService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/3/27
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TopicServiceImpl implements TopicService {
    @Resource
    private TopicDao topicDao;

    @Override
    public List<Topic> queryAll() {
        return topicDao.selectAll();
    }

    @Override
    public void addTopic(Topic topic) {
        topicDao.insert(topic);
//        int a = 1 / 0;
    }

    @Override
    public int[] batchInsert(List<Topic> topics) {
        return topicDao.batchInert(topics);
    }
}
