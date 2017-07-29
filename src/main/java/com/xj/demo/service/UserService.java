package com.xj.demo.service;

import com.xj.demo.domain.User;

import java.util.Date;
import java.util.List;

/**
 * Created by lenovo on 2016/10/25.
 */
public interface UserService {

    public User findById(Long id);

    public int insertSelective(User user);

    public int deleteByAgeAndBirthday(Integer age, Date birthday);

    public List<User> getAllUsers();

}
