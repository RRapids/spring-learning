package com.spring.annotation.web.dao;

import com.spring.annotation.web.config.SpringDataSourceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes ={SpringDataSourceConfig.class})
@WebAppConfiguration("src/main/resources")
public class JobDaoTest {
    @Autowired
    private JobDao jobDao;
    @Test
    public void selectAll() {
        System.out.println(jobDao.selectAll());
    }

    @Test
    public void batchInert() {
    }

    @Test
    public void insert() {

    }
}