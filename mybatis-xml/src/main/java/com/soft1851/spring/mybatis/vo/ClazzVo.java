package com.soft1851.spring.mybatis.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/3/31
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClazzVo {
    private Integer clazzId;
    private String clazzName;
    private Integer teacherId;
    private Integer studentId;
    private String studentName;
    private String homeTown;
    private LocalDate birthday;
}
