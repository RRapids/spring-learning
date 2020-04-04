package com.soft1851.spring.music.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/4/4
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Integer userId;
    private String userName;
    private String password;
    private String salt;
    private String email;
    private Integer phoneNumber;
    private Integer status;
    private Integer binding;
    private Integer credit;
    private Timestamp createTime;
    private Timestamp lastLoginTime;
    private List<String> musicList;
}
