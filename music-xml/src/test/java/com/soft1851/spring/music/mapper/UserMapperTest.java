package com.soft1851.spring.music.mapper;

import com.soft1851.spring.music.domain.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring-mybatis.xml")
public class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void selectById() throws SQLException {
        User user = userMapper.selectById(1);
        System.out.println(user);
    }

    @Test
    public void updateCredits() throws SQLException {
        userMapper.updateCredits(1);
        User user = userMapper.selectById(1);
        System.out.println("当前积分" + user.getCredits());
    }

    @Test
    public void insert() throws SQLException {
        User user = User.builder().userId(25)
                .phoneNumber(18094278).build();
        userMapper.insert(user);
    }

    @Test
    public void selectUser() throws SQLException {
        User user = userMapper.selectUser("1");
        System.out.println(user);
    }

    @Test
    public void updateLoginLastLoginTime() {
        User user = User.builder()
                .userId(1)
                .lastLoginTime(Timestamp.valueOf(LocalDateTime.now()))
                .build();
        userMapper.updateLoginLastLoginTime(user);
        System.out.println(user.getLastLoginTime());
    }

//    @Test
//    public void Login() throws SQLException {
//        User user = userMapper.selectById(1);
//        System.out.println(user);
//        UserDto userDto = new UserDto();
//        StringBuilder password = new StringBuilder(Math.toIntExact(Long.parseLong(user.getPassword())));
//        if (user.getUserName().equals(userDto.getUserName()) ||
//                user.getEmail().equals(userDto.getEmail()) ||
//                user.getPhoneNumber().equals(userDto.getPhoneNumber()) &&
//                        user.getPassword().equals(password.append(Algorithm.HMAC256(String.valueOf(user.getPassword()))))) {
//            user.setLastLoginTime(Timestamp.valueOf(LocalDateTime.now()));
//            userMapper.updateLoginLastLoginTime(user);
//            System.out.println(user);
//        } else {
//            System.err.println("登陆失败");
//        }
//    }

//    @Test
//    public void Registered() {
//        UserDto userDto = new UserDto();
//        SnowFlake idWorker = new SnowFlake(1, 3);
//        Long id = idWorker.nextId();
//        StringBuilder password = new StringBuilder(userDto.getPassword());
//        password.append(Algorithm.HMAC256(String.valueOf(userDto.getPassword())));
//        // ..............
//        User user = User.builder().build();
//        userMapper.insert(user);
//    }

//    @Test
//    public void AddPoints() throws SQLException {
//        User user = userMapper.selectById(1);
//    }
}