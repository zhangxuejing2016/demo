package com.xj.demo.impl;

import com.xj.demo.dao.UserDao;
import com.xj.demo.domain.User;
import com.xj.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
* Created by lenovo on 2016/10/25.
*/
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public User findById(Long id) {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public int insertSelective(User user) {
        return userDao.insertSelective(user);
    }

    @Override
    public int deleteByAgeAndBirthday(Integer age, Date birthday) {
        return userDao.deleteByAgeAndBirthday(age,birthday);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

}
