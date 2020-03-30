package com.spring.annotation.web.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/3/26
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Topic {
    private String id;
    private String topicName;
    private String topicIcon;
    private String description;
    private Integer msgCount;;
    private Integer followersCount;
    private Boolean followed;
}
