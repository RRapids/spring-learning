package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Course;

public interface CourseMapper {
    //根据班课id查询班课详情（班课自身信息、学生列表）
    Course getCourseById(int courseId);
}
