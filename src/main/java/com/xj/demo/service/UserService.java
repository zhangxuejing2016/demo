package com.xj.demo.service;

import com.xj.demo.bean.UserTestBean;
import com.xj.demo.domain.User;
import com.xj.demo.vo.UserQuery;

import java.util.Date;
import java.util.List;

/**
 * Created by lenovo on 2016/10/25.
 */
public interface UserService {

    public User findById(Long id);

    public List<User> findByCondition(UserQuery query);

    public int insertSelective(User user);

    public int deleteByAgeAndBirthday(Integer age, Date birthday);

    public List<User> getAllUsers();

    List<UserTestBean> getTestUsers(List<String> nameList, List<String> passwordList);
}
