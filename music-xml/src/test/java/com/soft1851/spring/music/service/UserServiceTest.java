package com.soft1851.spring.music.service;

import com.soft1851.spring.music.common.Result;
import com.soft1851.spring.music.domain.dto.UserDto;
import com.soft1851.spring.music.domain.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void login() {
    }

    @Test
    public void batchDelete() {
    }

    @Test
    public void selectUserDetailById() throws SQLException {
        UserDto userDto = UserDto.builder()
                .userId(1)
                .build();
        Result result = userService.selectUserDetailById(userDto);
        System.out.println(result.getData());
    }
}