package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Teacher;

public interface TeacherMapper {
    Teacher getTeacherOneToOne(int teacherId);
}
