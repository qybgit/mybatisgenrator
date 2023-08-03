package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.bean.mapper")
public class MybatisgenratorApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisgenratorApplication.class, args);

        System.out.println("启动");
        System.out.println("东");
        System.out.println("启");
    }

}
