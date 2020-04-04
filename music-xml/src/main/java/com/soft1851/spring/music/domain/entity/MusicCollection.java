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
public class MusicCollection {
    private Integer id;
    private String musicId;
    private String userId;
}
