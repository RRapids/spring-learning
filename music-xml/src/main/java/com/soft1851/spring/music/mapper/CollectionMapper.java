package com.soft1851.spring.music.mapper;

import com.soft1851.spring.music.domain.entity.MusicCollection;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Su
 * @className CollectionMapper
 * @Description TODO
 * @Date 2020/4/2 21:27
 * @Version 1.0
 **/
public interface CollectionMapper {

    /**
     * 判断是否存在数据并且添加收藏
     * @param musicCollection
     * @return
     */
    int insert(MusicCollection musicCollection);

    /**
     * 动态查询collection(多对多查询)
     * (暂时没测通)
     * @param musicCollection
     * @return
     */
    List<String> selectByCollectionId(MusicCollection musicCollection);

    //用户批量取消收藏
    int batchDelete(@Param("userId") Integer userId, @Param("idList") List<String> list);
}
