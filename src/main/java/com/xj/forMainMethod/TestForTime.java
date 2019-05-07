package com.xj.forMainMethod;

import com.alibaba.fastjson.JSON;
import com.xj.utils.DateUtils;

import java.util.*;

/**
 * Created Created by zxj on 2017/9/22 15:03.
 */
public class TestForTime {
    public static void main(String[] args) {
        Date birthday = DateUtils.getDateFromStr(DateUtils.dateToString(new Date(),"MM-dd"),"MM-dd");
        System.out.println(Date.class.getName());
//        Calendar start = new GregorianCalendar();
//        start.setTime(birthday);
//        start.set(Calendar.HOUR_OF_DAY, 0);
//        start.set(Calendar.MINUTE, 0);
//        start.set(Calendar.SECOND, 0);
//        start.set(Calendar.MILLISECOND, 0);
//
//        Calendar end = new GregorianCalendar();
//        end.setTime(birthday);
//        end.add(Calendar.DAY_OF_MONTH, 0);
//        end.set(Calendar.HOUR_OF_DAY, 23);
//        end.set(Calendar.MINUTE, 59);
//        end.set(Calendar.SECOND, 59);
//
//        Object startObject = start;
//        Object endObject = end;
//        System.out.println(start.getTime());
//        System.out.println(start.getTimeInMillis());
//        System.out.println(end.getTime());
//        System.out.println(end.getTimeInMillis());
//        System.out.println(birthday);
//        System.out.println(JSON.toJSONString(startObject));
//        System.out.println(JSON.toJSONString(endObject));


    }

}
