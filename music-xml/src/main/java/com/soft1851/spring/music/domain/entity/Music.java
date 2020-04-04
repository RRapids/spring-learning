package com.soft1851.spring.music.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/4/4
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Music {
    private Integer id;
    private String url;
    private String musicName;
    private String timeLong;
    private String singer;
}
