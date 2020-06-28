package com.study.mybatis;

import com.study.mybatis.entity.User;
import com.study.mybatis.mappers.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xupengtao
 * @Date 2020/6/28 10:35
 * @Version version 1.0.0
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.study.mybatis.mappers")
public class MybatisApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(MybatisApplication.class,args);
        System.out.println("容器启动成功");


    }
}
