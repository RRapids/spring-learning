package com.spring.annotation.web.dao.Impl;

import com.spring.annotation.web.dao.TopicDao;
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
 * @date 2020/3/26
 */
@Repository
public class TopicDaoImpl implements TopicDao {
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Topic> selectAll() {
        String sql ="SELECT * FROM t_topic";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Topic.class));
    }

    @Override
    public int[] batchInert(List<Topic> topics) {
        final List<Topic> topicList = topics;
        String sql = "INSERT INTO t_topic (id,topic_name,topic_icon,description,followers_count,msg_count,followed)" +
                "VALUES (?,?,?,?,?,?,?)";
        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                Topic topic = topicList.get(i);
                ps.setString(1, topic.getId());
                ps.setString(2,topic.getTopicName());
                ps.setString(3,topic.getTopicIcon());
                ps.setString(4,topic.getDescription());
                ps.setInt(5,topic.getMsgCount());
                ps.setInt(6,topic.getFollowersCount());
                ps.setBoolean(7,topic.getFollowed());
            }

            @Override
            public int getBatchSize() {
                return topicList.size();
            }
        });

    }

    @Override
    public int insert(Topic topic) {
        String sql = "INSERT INTO t_topic (id,topic_name,topic_icon,description,followers_count,msg_count,followed)" +
                "VALUES (?,?,?,?,?,?,?)";
        Object[] params = {topic.getId(), topic.getTopicName(), topic.getTopicIcon(),
                topic.getDescription(), topic.getMsgCount(), topic.getFollowersCount(), topic.getFollowed()};
        return jdbcTemplate.update(sql, params);
    }
}
