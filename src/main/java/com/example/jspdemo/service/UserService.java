package com.example.jspdemo.service;

import com.example.jspdemo.pojo.User;

import java.util.List;

public interface UserService {

    boolean addUser(User user);

    boolean deleteUser(long id);

    boolean updateUser(User user);

    User findUserById(long id);

    List<User> findAll();
}
