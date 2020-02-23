package com.grant.ssmdbdemo.dao;

import com.grant.ssmdbdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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
    User findByNameAndAge (String name, Integer age);
    User findByNameAndAge2 (@Param("name") String name, @Param("age") Integer age);
    User findByPojo (User user);
    User findByMap (Map<String, Object> map);
    User findByList(List<Object> list);
    User findByArray (Object [] array);
    User testGetValue1 (String name);

    User testGetValue2 (@Param("name") String name);

}
