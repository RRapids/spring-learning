package com.soft1851.spring.music.service;

import com.soft1851.spring.music.common.Result;
import com.soft1851.spring.music.domain.dto.UserDto;
import com.soft1851.spring.music.domain.entity.MusicCollection;

public interface CollectionService {


    //收藏歌曲接口
    Result insertCollection(MusicCollection musicCollection);
    //批量取消收藏
    Result batchDelete(UserDto userDto);
}
