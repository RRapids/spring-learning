package com.soft1851.spring.music.service.impl;

import com.soft1851.spring.music.common.Result;
import com.soft1851.spring.music.common.ResultCode;
import com.soft1851.spring.music.domain.dto.UserDto;
import com.soft1851.spring.music.domain.entity.MusicCollection;
import com.soft1851.spring.music.mapper.CollectionMapper;
import com.soft1851.spring.music.service.CollectionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/4/4
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CollectServiceImpl implements CollectionService {
    @Resource
    private CollectionMapper collectionMapper;

    @Override
    public Result insertCollection(MusicCollection musicCollection) {
        int n = collectionMapper.insert(musicCollection);
        if (n == 1){
         return Result.success();
        }else{
            return Result.failure(ResultCode.Collection_EXIST);
        }
    }

    @Override
    public Result batchDelete(UserDto userDto) {
        int n = collectionMapper.batchDelete(userDto.getUserId(), userDto.getMusicList());
        if (n != 0) {
            return Result.success();
        }else{
            return Result.failure(ResultCode.CANCEL_COLLECTION_FAIL);
        }

    }
}
