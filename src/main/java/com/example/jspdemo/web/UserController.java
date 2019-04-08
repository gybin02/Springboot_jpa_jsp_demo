package com.example.jspdemo.web;


import com.example.jspdemo.pojo.User;
import com.example.jspdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService service;

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/")
    public String index(){
        return "redirect:list";
    }

    @RequestMapping("list")
    public String list(Model model){
        List<User> all = service.findAll();
        model.addAttribute("users",all);
        return "user/list";
    }

    @RequestMapping("/add")
    public String goAddPage(){
        return "user/add";
    }
    @RequestMapping("/doAdd")
    public String doAdd(User user){
        service.addUser(user);
        return goList();
    }


    @RequestMapping("/delete")
    public String doDelete(long id){
        service.deleteUser(id);
        return goList();
    }

    @RequestMapping("/update")
    public String doUpdate(User user){
        service.updateUser(user);
        return goList();
    }

    private String goList(){
        return "redirect:list";
    }








}
