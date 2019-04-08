package com.example.jspdemo;

import com.example.jspdemo.pojo.User;
import com.example.jspdemo.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JspDemoApplicationTests {
    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        System.out.println("Test Runner");
    }

    @Test
    public void testUserService() {
        try {
            List<User> all = userService.findAll();
            ObjectMapper mapper = new ObjectMapper();
            String toJson = null;

            toJson = mapper.writeValueAsString(all);

//        String toJson = new GsonJsonProvider().toJson(all);
            System.out.println("findAll : " + toJson);


            User user = userService.findUserById(17);
            System.out.println("User : "+mapper.writeValueAsString(user));

            User userNew = new User();
            userNew.setName("测试add");
            userNew.setAge(23);
            userNew.setPassword("hh");
            userService.addUser(user);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAddUser() {
        try {
            ObjectMapper mapper = new ObjectMapper();

//            String toJson = mapper.writeValueAsString(all);
            User userNew = new User();
            userNew.setName("测试add");
            userNew.setAge(23);
            userNew.setId(11L);
            userNew.setPassword("hh");
            userService.addUser(userNew);
            System.out.println("User : "+mapper.writeValueAsString(userNew));

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}
