package com.example.forum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.forum.dto.User;
import com.example.forum.repositoryservices.UserRepositoryService;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserRepositoryService userRepositoryService;

    @Override
    public List<User>findAll(){
        return userRepositoryService.findAll();
    }

    @Override
    public User findOne(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User findByUserName(String username) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User save(User user) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
