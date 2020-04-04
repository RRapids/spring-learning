package com.soft1851.spring.music.service;

import com.soft1851.spring.music.common.Result;
import com.soft1851.spring.music.domain.dto.UserDto;
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
public class CollectionServiceTest {
    @Resource
    private CollectionService collectionService;

    @Test
    public void batchDelete() {
        List<String> list = new ArrayList<>();
        list.add("3");
        UserDto userDto = UserDto.builder()
                .userId(1)
                .musicList(list)
                .build();
        Result result = collectionService.batchDelete(userDto);
        System.out.println(result);
    }

    @Test
    public void insertCollection() {
        MusicCollection musicCollection = MusicCollection.builder()
                .userId("1")
                .musicId("3")
                .build();
        Result result = collectionService.insertCollection(musicCollection);
        System.out.println(result);
    }
}