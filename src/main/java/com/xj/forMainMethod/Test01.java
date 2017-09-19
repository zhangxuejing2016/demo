package com.xj.forMainMethod;

import com.alibaba.fastjson.JSON;
import com.xj.demo.annotations.FruitColor;
import com.xj.demo.annotations.FruitName;
import com.xj.demo.bean.Apple;
import com.xj.demo.domain.User;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2017/7/28.
 */
public class Test01 {
    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(String.valueOf(date));
        User u = new User();
        u.setUsername("hello");
        System.out.println(JSON.toJSONString(u));
    }
}