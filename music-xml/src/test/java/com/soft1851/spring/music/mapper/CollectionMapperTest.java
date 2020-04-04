package com.soft1851.spring.music.mapper;

import com.soft1851.spring.music.domain.entity.MusicCollection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class CollectionMapperTest {

    @Resource
    private CollectionMapper collectionMapper;

    @Test
    public void insert() {
        MusicCollection collection = MusicCollection.builder().userId("1").musicId("3").build();
        System.out.println(collectionMapper.insert(collection));
    }

    @Test
    public void selectByCollectionId() {
        collectionMapper.selectByCollectionId(MusicCollection.builder().musicId("1").build()).forEach(System.out::println);

//        collectionMapper.selectByCollectionId(MusicCollection.builder().musicId("1").build()).forEach(System.out::println);

//        userMapper.selectById(Collection.builder().musicId("1").userId("1").build()).forEach(System.out::println);
    }

    @Test
    public void batchDelete() {
        List<String> list = new ArrayList<>();
        int userId = 1;
        list.add("2");
//        list.add("2");
        collectionMapper.batchDelete(userId, list);
    }
}