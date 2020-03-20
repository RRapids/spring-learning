package com.Spring_Study.web.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ytf
 * @className Post
 * @Description TODO
 * @Date 2020/3/17
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Post {
    private long postId;
    private long forumId;
    private String title;
    private String content;
    private String thumbnail;
    private java.sql.Timestamp createTime;
}

