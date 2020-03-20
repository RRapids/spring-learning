package com.Spring_Study.web.service.impl;

import com.Spring_Study.web.entity.Forum;
import com.Spring_Study.web.service.ForumService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class ForumServiceImplTest {
    @Autowired
    private ForumService forumService;

    @Test
    public void get() {
        Forum forum = forumService.get(8);
        assertNotNull(forum);
    }
}