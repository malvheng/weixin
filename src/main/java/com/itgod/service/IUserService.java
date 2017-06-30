package com.itgod.service;

import java.util.List;

import com.itgod.entity.User;

public interface IUserService {  
    public User getUserById(int userId);  
    
    public List<User> find();
    
} 
