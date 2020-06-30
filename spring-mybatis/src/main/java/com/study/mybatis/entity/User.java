package com.study.mybatis.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author xupengtao
 * @Date 2020/6/28 10:37
 * @Version version 1.0.0
 **/
@Data
public class User implements Serializable {

    private long id;
    private String name;
    private String password;
}
