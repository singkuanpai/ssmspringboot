package com.grant.ssmdbdemo.controller;

import com.grant.ssmdbdemo.entity.User;
import com.grant.ssmdbdemo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author grantbai
 * @title: UserController
 * @projectName ssmdbdemo
 * @description: TODO
 * @date 2020/2/23 10:28
 */
@RestController
public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping(value = "/first")
    public User firstTest() {
        //调用dao层
        User user = userDao.findById(1L);
        return user;
    }

    @RequestMapping(value = "/findById/{id}")
    public User findById(@PathVariable Long id) {
        //调用dao层
        User user = userDao.findById(id);
        return user;
    }

    @RequestMapping(value = "/findByMap/{name}/{age}")
    public User findByMap(@PathVariable Map<String, Object> map) {
        //调用dao层
        User user = userDao.findByMap(map);
        return user;
    }

    @RequestMapping(value = "/findByMap2/{name}/{age}")
    public User findByMap2(@PathVariable Map<String, String> map) {
        //调用dao层
        String name = map.get("name");
        Integer age = Integer.parseInt(map.get("age"));
        User user = userDao.findByNameAndAge(name, age);

        return user;
    }


    //
}
