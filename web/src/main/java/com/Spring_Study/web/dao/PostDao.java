package com.Spring_Study.web.dao;


import com.Spring_Study.web.entity.Post;

import java.util.List;


public interface PostDao {
    /**
     * 插入数据
     * @param post
     * @return
     */
    int insert(Post post);

    /**
     * 批量插入数据
     * @param posts
     * @return
     */
    int[] bathInsert(List<Post> posts);

    /**
     * 根据id删除post
     * @param postId
     * @return
     */
    int delete(int postId);

    /**
     * 修改post
     * @param post
     * @return
     */
    int update(Post post);

    /**
     * 根据id查询post
     *
     * @param postId
     * @return
     */
    Post get(int postId);

    /**
     * 查询所有帖子
     * @return
     */
    List<Post>selectAll();


    List<Post>selectByKey(String key);

    int count();

    int[] batchDelete(List<Post> posts);


}
