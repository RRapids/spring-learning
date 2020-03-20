package com.Spring_Study.web.dao.impl;


import com.Spring_Study.web.dao.PostDao;
import com.Spring_Study.web.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


@Repository
public class PostDaoImpl implements PostDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Post post) {
        String sql = "INSERT INTO t_post VALUES (NULL,?,?,?,?,?) ";
        Object[] args = {post.getForumId(), post.getTitle(), post.getContent(), post.getThumbnail(), post.getCreateTime()};
        return jdbcTemplate.update(sql, args);
    }

    @Override
    public int[] bathInsert(List<Post> posts) {
        final List<Post> postList = posts;
        String sql = "INSERT INTO t_post VALUES (NULL,?,?,?,?,?) ";
        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                preparedStatement.setLong(1, postList.get(i).getForumId());
                preparedStatement.setString(2, postList.get(i).getTitle());
                preparedStatement.setString(3, postList.get(i).getContent());
                preparedStatement.setString(4, postList.get(i).getThumbnail());
                preparedStatement.setTimestamp(5, postList.get(i).getCreateTime());
            }

            @Override
            public int getBatchSize() {
                return postList.size();
            }
        });
    }

    @Override
    public int delete(int postId) {
        String sql = "DELETE FROM t_post WHERE post_id=? ";
        Object[] args = {postId};
        return jdbcTemplate.update(sql, args);
    }

    @Override
    public int update(Post post) {
        String sql = "UPDATE t_post SET title =? WHERE post_id=? ";
        Object[] args = {post.getTitle(), post.getPostId()};
        return jdbcTemplate.update(sql, args);
    }

    @Override
    public Post get(int postId) {
        String sql = "SELECT * FROM t_post WHERE post_id=? ";
        Object[] args = {postId};
        return jdbcTemplate.queryForObject(sql, args, new BeanPropertyRowMapper<>(Post.class));

    }

    @Override
    public List<Post> selectAll() {
        String sql = "SELECT * FROM t_post ";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Post.class));
    }

    @Override
    public List<Post> selectByKey(String key) {
        String sql = "SELECT * FROM t_post WHERE " +
                "title LIKE CONCAT('%', ?, '%') " +
                "OR content LIKE CONCAT('%', ?, '%') " +
                "OR thumbnail LIKE CONCAT('%', ?, '%') ";
        Object[] args = {key, key, key};
        return jdbcTemplate.query(sql, args, new BeanPropertyRowMapper<>(Post.class));
    }

    @Override
    public int count() {
        String sql = "SELECT COUNT(*) FROM t_post";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public int[] batchDelete(List<Post> posts) {
        final List<Post>postList=posts;
        String sql="DELETE FROM t_post WHERE post_id=?";
        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                preparedStatement.setLong(1,postList.get(i).getPostId());
            }

            @Override
            public int getBatchSize() {
                return postList.size();
            }
        });
    }


}

