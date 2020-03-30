package com.spring.annotation.web.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/3/27
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Job {
    private String jobName;
    private String jobEnter;
    private String jobSalary;
    private String upTime;
    private String jobLogo;
}
