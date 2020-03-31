package com.soft1851.spring.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/3/31
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Clazz {
    private Integer clazzId;
    private String clazzName;
    private Integer teacherId;
    private List<Student> students;
}
