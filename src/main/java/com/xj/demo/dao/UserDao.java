package com.xj.demo.dao;

import com.xj.demo.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;


/**
 * Created by lenovo on 2016/10/25.
 */

public interface UserDao {

    int deleteByPrimaryKey(Long id);


    int insert(User record);


    int insertSelective(User record);


    User selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(User record);


    int updateByPrimaryKey(User record);


    int deleteByAgeAndBirthday(@Param("age")Integer age, @Param("birthday")Date birthday);

    List<User> getAllUsers();

}
