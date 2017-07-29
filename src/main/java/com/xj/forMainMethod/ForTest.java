package com.xj.forMainMethod;

import com.alibaba.fastjson.JSON;
import com.xj.constant.CardTemplateStatusEnum;
import com.xj.demo.domain.User;
import com.xj.utils.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zxj on 2017/6/7.
 */
public class ForTest {

    private static void checkUser(User u){
        u = new User();
        u.setUsername("wulalalala");
    }

    public static void main(String[] args) {
//        int num = 2147483647;
//        long x = num + 2L;
//        System.out.println(x);
//        String date = "2017-06-19";
//        Date birthday = DateUtils.getDateFromStr(date, "yyyy-MM-dd");
//        System.out.println(DateUtils.formatDate(birthday, "MM-dd"));
//        System.out.println(DateUtils.getDateFromStr(DateUtils.dateToString(DateUtils.getDateFromStr(date, "yyyy-MM-dd"), "MM-dd"), "MM-dd"));
//        System.out.println(DateUtils.getDateFromStr(DateUtils.dateToString(new Date(), "yyyy-MM-dd"),"yyyy-MM-dd"));
//        System.out.println(DateUtils.getDateFromStr(date,"yyyy-MM-dd"));

//        Integer aa = 1;
//        System.out.println(aa == CardTemplateStatusEnum.ACTIVE_PUBLISHED.getCode());

        User user01 = new User();
        user01.setUsername("name");
        user01.setPassword("123");
        checkUser(user01);
        System.out.println(JSON.toJSONString(user01));
    }
}
