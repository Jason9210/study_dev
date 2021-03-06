package com.study.mybatis.controllers;

import com.study.mybatis.entity.User;
import com.study.mybatis.mappers.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xupengtao
 * @Date 2020/6/28 11:51
 * @Version version 1.0.0
 **/
@Controller
public class CacheController implements ApplicationContextAware {



    private ApplicationContext applicationContext;

    @RequestMapping("/select")
    public String select(){
        selectByIdList();
        return "查询完成";
    }

    @RequestMapping("/select1")
    public String select1(){
        SqlSessionFactory factory = applicationContext.getBean(SqlSessionFactory.class);
        SqlSession sqlSession = factory.openSession(true);
       UserMapper userMapper =  sqlSession.getMapper(UserMapper.class);
        List<Long> ids = new ArrayList<>();
        ids.add(Long.valueOf(1));
        ids.add(Long.valueOf(2));
        userMapper.selectList(ids);
        userMapper.selectList(ids);
     /*   selectByIdList();
        selectByIdList();*/
        return "查询完成";
    }

    private List<User> selectByIdList(){
        List<Long> ids = new ArrayList<>();
        ids.add(Long.valueOf(1));
        ids.add(Long.valueOf(2));
        UserMapper userMapper = applicationContext.getBean(UserMapper.class);
        List<User> list = userMapper.selectList(ids);
        System.out.println(list==null?0:list.size());
        System.out.println("查询完成");
        return list;
    }

    @RequestMapping("/update")
    public String update(){
        User user = new User();
        user.setId(1L);
        user.setPassword(String.valueOf(System.currentTimeMillis()));
        UserMapper userMapper = applicationContext.getBean(UserMapper.class);
        userMapper.update(user);
        return "update";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}

