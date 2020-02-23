package com.grant.ssmdbdemo.dao;

import com.grant.ssmdbdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author grantbai
 * @title: UserDao
 * @projectName ssmdbdemo
 * @description: TODO
 * @date 2020/2/23 09:49
 */
@Mapper
public interface UserDao {
    User findById(Long id);
}
