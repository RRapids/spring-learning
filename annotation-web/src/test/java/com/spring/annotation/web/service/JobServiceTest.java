package com.spring.annotation.web.service;

import com.spring.annotation.web.config.SpringDataSourceConfig;
import com.spring.annotation.web.entity.Job;
import com.spring.annotation.web.spider.JobSpider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes ={SpringDataSourceConfig.class})
@WebAppConfiguration("src/main/resources")
public class JobServiceTest {

    @Autowired
    private JobService jobService;
    @Test
    public void queryAll() {
    }

    @Test
    public void addJob() {
        Job job = Job.builder()
                .jobLogo("test")
                .jobName("test")
                .jobEnter("test")
                .jobSalary("test")
                .upTime("test")
                .build();
        jobService.addJob(job);
    }

    @Test
    public void batchInsert() throws IOException {
        int[] ints = jobService.batchInsert(JobSpider.getJobs());
        assertEquals(JobSpider.getJobs().size(),ints.length);
    }
}