package com.spring.annotation.web.service;

import com.spring.annotation.web.config.SpringDataSourceConfig;
import com.spring.annotation.web.entity.Topic;
import com.spring.annotation.web.spider.JueJinSpider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes ={SpringDataSourceConfig.class})
@WebAppConfiguration("src/main/resources")

public class TopicServiceTest {
    @Autowired
    private TopicService topicService;
    @Test
    public void queryAll() {
        List<Topic> topics = topicService.queryAll();
        assertEquals(3,topics.size());
    }

    @Test
    public void addTopic() {
        Topic topic = Topic.builder()
                .id("1")
                .topicName("test")
                .topicIcon("icon")
                .description("test")
                .msgCount(33)
                .followersCount(33)
                .followed(true)
                .build();
        topicService.addTopic(topic);
    }

    @Test
    public void batchInsert() {
        int[] ints = topicService.batchInsert(JueJinSpider.getTopics());
        assertEquals(JueJinSpider.getTopics().size(),ints.length);
    }
}