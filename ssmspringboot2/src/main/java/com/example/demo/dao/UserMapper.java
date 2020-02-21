package com.example.demo.dao;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by Enzo Cotter on 2020/2/21.
 */

@Mapper
@Repository
public interface UserMapper {
    User selectUserByName(String name);
}
