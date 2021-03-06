package com.Spring_Study.web.service.impl;

import com.Spring_Study.web.dao.ForumDao;
import com.Spring_Study.web.entity.Forum;
import com.Spring_Study.web.service.ForumService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForumServiceImpl implements ForumService {

    private final ForumDao forumDao;

    public ForumServiceImpl(ForumDao forumDao) {
        this.forumDao = forumDao;
    }

    @Override
    public List<Forum> selectAll() {
        return forumDao.selectAll();
    }

    @Override
    public Forum get(int forumId) {
        return forumDao.get(8);
    }
}
