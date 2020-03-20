package com.Spring_Study.web.service.impl;

import com.Spring_Study.web.dao.PostDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class PostServiceImplTest {

    @Autowired
    private PostDao postDao;
    @Test
    public void get() {
        postDao.get(9);
    }
}