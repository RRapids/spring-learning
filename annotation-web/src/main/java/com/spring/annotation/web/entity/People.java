package com.spring.annotation.web.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/3/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class People {
    private String title;
    private String description;
    private String img;
}
