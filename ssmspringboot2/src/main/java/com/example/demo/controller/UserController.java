package com.example.demo.controller;

import com.example.demo.dao.UserMapper;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Enzo Cotter on 2020/2/21.
 */

//证明是controller层并且返回json
@RestController
public class UserController {
    //依赖注入
    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "myname")
    public User cs() {
        //调用dao层
        User user = userMapper.selectUserByName("a1");
        return user;
    }
}
