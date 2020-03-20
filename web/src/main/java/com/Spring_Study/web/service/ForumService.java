package com.Spring_Study.web.service;


import com.Spring_Study.web.entity.Forum;

import java.util.List;

/**
 * @author wl
 * @className ForumService
 * @Description TODO
 * @Date 2020/3/20 13:57
 * @Version 1.0
 **/
public interface ForumService {

    List<Forum> selectAll();

    Forum get(int forumId);
}
