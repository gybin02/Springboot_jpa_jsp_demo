package com.example.jspdemo.dao;

import com.example.jspdemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

//@Mapper
public interface UserDao extends JpaRepository<User, Long> {

}
