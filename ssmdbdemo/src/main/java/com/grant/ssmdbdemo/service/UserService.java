package com.grant.ssmdbdemo.service;

import com.grant.ssmdbdemo.dao.UserDao;
import com.grant.ssmdbdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return userDao.findById(id);
    }
}
