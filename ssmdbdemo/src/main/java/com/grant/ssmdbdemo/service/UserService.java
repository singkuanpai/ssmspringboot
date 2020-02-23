package com.grant.ssmdbdemo.service;

import com.grant.ssmdbdemo.dao.UserDao;
import com.grant.ssmdbdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author grantbai
 * @title: UserService
 * @projectName ssmdbdemo
 * @description: TODO
 * @date 2020/2/23 09:51
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User findById (Long id) {
        if (id != null && id > 0) {
            return userDao.findById(id);
        }
        return null;
    }

    public User findByNameAndAge (String name, Integer age) {
        if (name == null
                || "".equals(name)
                || age == null
                || age < 1) {
            return null;
        } else {
            return userDao.findByNameAndAge(name, age);
        }
    }

    public User findByNameAndAge2 (String name, Integer age) {
        if (name == null
                || "".equals(name)
                || age == null
                || age < 1) {
            return null;
        } else {
            return userDao.findByNameAndAge2(name, age);
        }
    }

    public User findByPojo (User user) {
        if (user != null) {
            return userDao.findByPojo(user);
        }
        return null;
    }
    public User findByMap (Map<String, Object> map) {
        if (map != null) {
            return userDao.findByMap(map);
        }
        return null;
    }

    public User findByList (List<Object> list) {
        if (list != null && list.size() > 0) {
            return userDao.findByList(list);
        }
        return null;
    }

    public User findByArray (Object [] array) {
        if (array != null && array.length > 0) {
            return userDao.findByArray(array);
        }
        return null;
    }

    public User testGetValue1 (String name) {
        if (name != null && name.length() > 0) {
            return userDao.testGetValue1(name);
        }
        return null;
    }

    public User testGetValue2 (String name) {
        if (name != null && name.length() > 0) {
            return userDao.testGetValue2(name);
        }
        return null;
    }





}
