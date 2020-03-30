package com.spring.annotation.web.dao.Impl;

import com.spring.annotation.web.dao.JobDao;
import com.spring.annotation.web.entity.Job;
import com.spring.annotation.web.entity.Topic;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/3/28
 */
@Repository
public class JobDaoImpl implements JobDao {
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Job> selectAll() {
        String sql ="SELECT * FROM t_job";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Job.class));
    }

    @Override
    public int[] batchInert(List<Job> jobs) {
        final List<Job> jobList = jobs;
        String sql = "INSERT INTO t_job (job_name,job_enter,job_salary,up_time,job_logo)" +
                "VALUES(?,?,?,?,?)";
        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                Job job = jobList.get(i);
                ps.setString(1,job.getJobLogo());
                ps.setString(2,job.getJobName());
                ps.setString(3,job.getJobEnter());
                ps.setString(4,job.getJobSalary());
                ps.setString(5,job.getUpTime());
            }

            @Override
            public int getBatchSize() {
                return jobList.size();
            }
        });
    }

    @Override
    public int insert(Job job) {
        String sql = "INSERT INTO t_job (job_name,job_enter,job_salary,up_time,job_logo)" +
                "VALUES(?,?,?,?,?)";
        Object[] params = {job.getJobName(), job.getJobEnter(), job.getJobSalary(), job.getUpTime(),job.getJobLogo()};
        return jdbcTemplate.update(sql, params);
    }
}
