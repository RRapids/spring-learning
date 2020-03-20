package com.Spring_Study.web.service.impl;

import com.Spring_Study.web.dao.PostDao;
import com.Spring_Study.web.entity.Post;
import com.Spring_Study.web.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/3/20
 */
@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostDao postDao;
    @Override
    public Post get(int postId) {
        return postDao.get(9);
    }
}
