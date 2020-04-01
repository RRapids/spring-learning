package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.dto.MatterDto;
import com.soft1851.spring.mybatis.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class StudentMapperTest {

    @Resource
    private StudentMapper studentMapper;

    @Test
    public void insert() {
        Student student = Student.builder()
                .clazzId(1)
                .studentName("测试学生")
                .hometown("江苏南京")
                .birthday(LocalDate.of(2000, 10, 10))
                .build();
        studentMapper.insert(student);
        System.out.println(student.getStudentName());
    }

    @Test
    public void delete() {
    }

    @Test
    public void update() {
        Student student = studentMapper.getStudentById(2009);
        System.out.println(student);
        student.setStudentName("new name");
        student.setHometown("新地址");
        student.setBirthday(LocalDate.of(1999, 12, 10));
        studentMapper.update(student);
        System.out.println(studentMapper.getStudentById(2009));
    }

    @Test
    public void getStudentById() {
        Student student = studentMapper.getStudentById(2009);
        System.out.println(student);
    }

    @Test
    public void batchInsert() {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = Student.builder()
                    .studentId(4000 + i)
                    .studentName("测试" + i)
                    .clazzId(1)
                    .hometown("测试城市")
                    .birthday(LocalDate.of(2000, 9, 9))
                    .build();
            students.add(student);
        }
        System.out.println(studentMapper.batchInsert(students));
    }

    @Test
    public void batchDelete() {

    }

    @Test
    public void selectLimit() {
        System.out.println(studentMapper.selectLimit());
    }

    @Test
    public void selectLimitFromTeacherInClassByDynamicSql() {
        MatterDto matterDto = MatterDto.builder()
                .teacherName("许老师")
                .clazzName("软件1851")
                .studentName("李")
                .build();
        studentMapper.selectLimitFromTeacherInClassByDynamicSql(matterDto).forEach(System.out::println);
    }

    @Test
    public void selectAll() {
        List<Student> students = studentMapper.selectAll();
        students.forEach(student -> {
            System.out.println(student.getStudentId()
                    + "," + student.getStudentName()
                    + "," + student.getHometown()
                    + "," + student.getBirthday()
                    + "," + student.getClazz().getClazzName());
        });
    }
}