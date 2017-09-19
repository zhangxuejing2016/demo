package com.xj.demo.controller;

import com.xj.demo.bean.CommonResponse;
import com.xj.demo.bean.UserTestBean;
import com.xj.demo.domain.User;
import com.xj.demo.service.UserService;
import com.xj.demo.vo.UserQuery;
import org.apache.commons.collections.CollectionUtils;
import org.durcframework.core.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zxj on 2016/10/25.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/show")
    @ResponseBody
    public User welcomeUser(){
        Long id = 1L;
        User user = userService.findById(id);
        return user;
    }

    @RequestMapping("/user/login")
    @ResponseBody
    public CommonResponse<Boolean> login(String userName, String passWord){
        ModelAndView mav = new ModelAndView("showUsers");
        UserQuery query = new UserQuery();
        query.setUserName(userName);
        query.setPassWord(passWord);
        List<User> users = userService.findByCondition(query);
        if(CollectionUtils.isNotEmpty(users)){
            return new CommonResponse<Boolean>(0,"登录成功",null,true);
        }
        return new CommonResponse<Boolean>(0,"用户名或密码不正确",null,true);
    }

    @RequestMapping("/add")
    @ResponseBody
    public CommonResponse addUser(){
//        Long id = 1L;
//        User user = userService.findById(id);
//        return user;
        CommonResponse rp = new CommonResponse();
        String beginDate = "2017-03-23";
        try {
            for(int i=0; i<1000; i++){
                User u = new User();
                u.setNickname("风格");
                u.setAge(10);
                u.setEmail("123@123.com");
                u.setPassword("111");
                u.setUsername("是电费");
                u.setBirthday(DateUtil.convertStringToDate(beginDate, "yyyy-MM-dd"));
            int id = userService.insertSelective(u);
            }
            rp.setMessage("插入成功");
            rp.setStatus(0);
        } catch (ParseException e) {
            rp.setMessage("插入失败");
            rp.setStatus(0);
            e.printStackTrace();
            return rp;
        }
        return rp;
    }

    @RequestMapping("/userList")
    public ModelAndView listUsers(HttpServletRequest request, Date test){
        System.out.println(test.toString());
        ModelAndView mav = new ModelAndView("showUsers");
        List<User> users = userService.getAllUsers();
        mav.addObject("userList",users);
        return mav;
    }

    @RequestMapping("/userTest")
    @ResponseBody
    public List<UserTestBean> userTest(){
        List<String> nameList = new ArrayList<String>();
        List<String> passwordlist = new ArrayList<String>();

        nameList.add("Penny");
        nameList.add("Joey");
        passwordlist.add("Joey123");
        passwordlist.add("Danny123");
        List<UserTestBean> users = userService.getTestUsers(nameList,passwordlist);
        return users;
    }

}
