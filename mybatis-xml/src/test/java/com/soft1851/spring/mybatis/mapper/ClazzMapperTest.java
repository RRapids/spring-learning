package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Clazz;
import com.soft1851.spring.mybatis.entity.Student;
import com.soft1851.spring.mybatis.vo.ClazzVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class ClazzMapperTest {

    @Resource
    private ClazzMapper clazzMapper;
    @Test
    public void getClazzStudent() {
        List<ClazzVo> clazzVo = clazzMapper.getClazzStudent(1);
        clazzVo.forEach(System.out::println);
    }

    @Test
    public void getClazzOneToMany() {
        Clazz clazz = clazzMapper.getClazzOneToMany(1);
        System.out.println(clazz.getClazzId()+","+clazz.getClazzName());
        List<Student> students = clazz.getStudents();
        students.forEach(student -> {
            System.out.println(student.getStudentId() +
                    "," + student.getStudentName() + "," + student.getHometown() + "," + student.getBirthday());
        });
    }
}