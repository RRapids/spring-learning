package com.spring.annotation.web.service.Impl;

import com.spring.annotation.web.dao.JobDao;
import com.spring.annotation.web.entity.Job;
import com.spring.annotation.web.service.JobService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/3/28
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class JobServiceImpl implements JobService {
    @Resource
    private JobDao jobDao;

    @Override
    public List<Job> queryAll() {
        return jobDao.selectAll();
    }

    @Override
    public void addJob(Job job) {
        jobDao.insert(job);
//        int a = 1 / 0;
    }

    @Override
    public int[] batchInsert(List<Job> jobs) {
        return jobDao.batchInert(jobs);
    }
}
