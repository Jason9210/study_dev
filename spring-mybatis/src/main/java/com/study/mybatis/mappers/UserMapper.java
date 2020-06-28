package com.study.mybatis.mappers;

import com.study.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author xupengtao
 * @Date 2020/6/28 10:37
 * @Version version 1.0.0
 **/
@Mapper
public interface UserMapper {


    List<User> selectList(List<Long> ids);

    int update(User user);

}
