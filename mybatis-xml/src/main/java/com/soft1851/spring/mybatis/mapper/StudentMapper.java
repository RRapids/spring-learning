package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.dto.MatterDto;
import com.soft1851.spring.mybatis.entity.Student;
import com.soft1851.spring.mybatis.vo.MatterVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public interface StudentMapper {
    //根据id查询
    Student getStudentById(int id);
    //增
    void insert(Student student);
    //删
    void delete(int studentId);
    //改
    void update(Student student);
    //批量插入
    int batchInsert(@Param("students") List<Student> students);
    //批量删除
    int batchDelete(@Param("idList") List<Integer> idList);
    //单表（带两个指定条件）查询
    List<Student> selectLimit();
    //单表指定条件查询（结合动态SQL）
    List<Student> selectLimitByDynamicSql(Student student);

    //查询某位老师的某个班级上面的某个学生
    List<MatterVo> selectLimitFromTeacherInClassByDynamicSql(MatterDto matterDto);

    //查询所有学生，按生日排序，多对一关联查询学生所在班级信息
    List<Student> selectAll();
}
