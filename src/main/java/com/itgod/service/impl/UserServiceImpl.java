package com.itgod.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itgod.dao.UserMapper;
import com.itgod.entity.User;
import com.itgod.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
	
	@Resource
    private UserMapper userMapper;

	@Override
	public User getUserById(int userId) {
		  // TODO Auto-generated method stub  
        return this.userMapper.selectByPrimaryKey(userId); 
	}

	@Override
	public List<User> find() {
		 return this.userMapper.find();
	}
	
	

}
