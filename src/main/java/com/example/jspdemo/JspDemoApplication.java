package com.example.jspdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.example.jspdemo.dao")
public class JspDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JspDemoApplication.class, args);
        System.out.println("程序正在运行...");
    }

}
