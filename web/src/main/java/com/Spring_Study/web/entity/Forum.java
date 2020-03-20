package com.Spring_Study.web.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ytf
 * @className Forum
 * @Description TODO
 * @Date 2020/3/17
 * @Version 1.0
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Forum {
    private Integer forumId;
    private String forumName;
}
