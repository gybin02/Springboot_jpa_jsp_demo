package com.example.jspdemo.service.impl;

import com.example.jspdemo.dao.UserDao;
import com.example.jspdemo.pojo.User;
import com.example.jspdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public boolean addUser(User user) {
        userDao.save(user);
        return true;
    }

    @Override
    public boolean deleteUser(long id) {
        userDao.deleteById(id);
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        userDao.save(user);
        return false;
    }

    @Override
    public User findUserById(long id) {
        Optional<User> optional = userDao.findById(id);
        return optional.orElse(null);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
