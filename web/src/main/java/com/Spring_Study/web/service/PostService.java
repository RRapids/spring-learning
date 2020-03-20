package com.Spring_Study.web.service;

import com.Spring_Study.web.entity.Post;

public interface PostService {

    /**
     * 根据id查询post
     *
     * @param postId
     * @return
     */
    Post get(int postId);
}
