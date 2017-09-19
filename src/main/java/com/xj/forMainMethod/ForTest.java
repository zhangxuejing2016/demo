package com.xj.forMainMethod;

import com.alibaba.fastjson.JSON;
import com.xj.constant.CardTemplateStatusEnum;
import com.xj.demo.domain.User;
import com.xj.utils.DateUtils;

import javax.jws.soap.SOAPBinding;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by zxj on 2017/6/7.
 */
public class ForTest {

    public static void main(String[] args) {

        User u = new User();
        u.setUsername("xuejing");
        Map<String,String> map = new HashMap<String, String>();
        map.put("1","111");
        map.put("2",null);
        for(Map.Entry<String,String> vo : map.entrySet()){
            System.out.println(vo.getValue().toString());
        }
        String str = " ";
        System.out.println(str.substring(0,str.length()-1));

//        try {
////            System.out.println(DateUtils.strToDate("2017-08-07 20:10:10","yyyy-MM-dd HH:mm:ss").before(new Date()));
////            System.out.println(DateUtils.strToDate("2017-08-07 20:10:10","yyyy-MM-dd HH:mm:ss"));
//            List<String> list = new ArrayList<String>();
//            List<String> list1 = new ArrayList<String>();
//            List<String> list2 = new ArrayList<String>();
//            list1.add("a");
//            list2.add("b");
//            list.addAll(list1);
//            list.addAll(list2);
//            System.out.println(JSON.toJSON(list));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
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

//        Map map = new HashMap();
//        List<User> list = new ArrayList<User>();
//
//        User user01 = new User();
//        user01.setUsername("name001");
//        user01.setPassword("123");
//
//        User user02 = new User();
//        user02.setUsername("name002");
//        user02.setPassword("456");
//
//        map.put(user01,user01);
//        map.put(user02,user02);
//        System.out.println(JSON.toJSONString(map));
//
//        list.add(user01);
//        for(User u : list){
//            map.remove(u);
//        }
//
//        System.out.println(JSON.toJSONString(map));

//        User user01 = new User();
//        user01.setUsername("xiaoq");
//        User user02 = new User();
//        user02.setUsername("daq");
//        Map<String,User> map = new HashMap<String, User>();
//        map.put("1",user01);
//        map.put("1",user02);
//        System.out.println(JSON.toJSON(map));
    }
}
