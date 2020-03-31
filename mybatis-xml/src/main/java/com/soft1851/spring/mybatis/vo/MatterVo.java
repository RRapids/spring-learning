package com.soft1851.spring.mybatis.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/3/31
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MatterVo {
    private String teacherName;
    private String clazzName;
    private String hometown;
    private String birthday;
}
