package com.itgod.dao;

import com.itgod.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
    
    List<User> find();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}