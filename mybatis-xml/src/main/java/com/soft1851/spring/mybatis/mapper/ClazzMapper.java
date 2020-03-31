package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Clazz;
import com.soft1851.spring.mybatis.vo.ClazzVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public interface ClazzMapper {
    //获取指定班课中所有学生信息
    List<ClazzVo> getClazzStudent(int clazzId);
    //根据clazzId一对多关联查询本版所有学生
    Clazz getClazzOneToMany(int clazzId);

}
