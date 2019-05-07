package com.xj.forMainMethod;

import com.alibaba.fastjson.JSON;
import com.xj.utils.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created Created by zxj on 2017/10/12 16:24.
 */
public class ForTime {
    public static void main(String[] args) {
        Date date = new Date(1543507200000L);
        Date date_1 = new Date(1522745132797L);
        System.out.println("publishEndTime:"+date);
        System.out.println("publishStartTime:"+JSON.toJSONString(date_1.toString()));

        Date date1 = DateUtils.getDateFromStr("2018-11-30 00:00:00", "yyyy-MM-dd HH:mm:ss");
        Date date2 = DateUtils.getDateFromStr("2018-12-31 23:59:59", "yyyy-MM-dd HH:mm:ss");
        System.out.println("date1:"+JSON.toJSONString(date1));
        System.out.println("date2:"+JSON.toJSONString(date2));

//        Date birthday = DateUtils.getDateFromStr(DateUtils.dateToString(DateUtils.getDateFromStr("2011-01-01", "yyyy-MM-dd"),"MM-dd"),"MM-dd");
//        Calendar start = new GregorianCalendar();
//        start.setTime(birthday);
//        start.add(Calendar.DAY_OF_MONTH, -1);
//        start.set(Calendar.HOUR_OF_DAY, 12);
//        start.set(Calendar.MINUTE, 0);
//        start.set(Calendar.SECOND, 0);
//        start.set(Calendar.MILLISECOND, 0);
//        System.out.println(JSON.toJSONString(start.getTime()));
//        System.out.println(start.get(Calendar.DAY_OF_MONTH));
//        System.out.println(start.get(Calendar.MONTH));
//
//        Long time = birthday.getTime();
//        System.out.println(DateUtils.getDateFromStr(DateUtils.dateToString(new Date(),"MM-dd"),"MM-dd"));
//        System.out.println(time);
//        try {
//            Date birthday = DateUtils.getDateFromStr(DateUtils.dateToString(DateUtils.getDateFromStr("1992-01-01", "yyyy-MM-dd"),"MM-dd"),"MM-dd");
//            Date startDayFormat = DateUtils.getDateFromStr(DateUtils.dateToString(DateUtils.getDateFromStr("2017-12-31", "yyyy-MM-dd"),"MM-dd"),"MM-dd");
////            Date  = DateUtils.getDateFromStr(DateUtils.dateToString(DateUtils.getDateFromStr("2018-01-18", "yyyy-MM-dd"),"MM-dd"),"MM-dd");
////            Date startDayFormat = new Date();
//            Calendar endDayFormat = getEndTime(startDayFormat,2);
//            Calendar startDay = getStartTime(startDayFormat);
//            System.out.println("birthdayFormat:" + JSON.toJSONString(birthday.toString()));
//            System.out.println("startDayFormat:" + JSON.toJSONString(startDayFormat.toString()));
//            System.out.println("endDayFormat:" + JSON.toJSONString(endDayFormat.getTime().toString()));
//            boolean flag = startDay.get(Calendar.YEAR) < endDayFormat.get(Calendar.YEAR);
//            if(flag){
//                //跨年
//                endDayFormat.set(Calendar.YEAR,1970);
//                if(birthday.compareTo(startDay.getTime()) >= 0 || birthday.compareTo(endDayFormat.getTime()) <= 0){
//                    System.out.println(birthday.compareTo(endDayFormat.getTime()) >= 0);
//                    System.out.println(birthday.compareTo((startDay.getTime())) <= 0);
//                    System.out.println("该用户生日在跨年日期范围内");
//                }
//            }
//            if(birthday.compareTo(startDayFormat) >= 0 && birthday.compareTo(endDayFormat.getTime()) <= 0){
//                System.out.println("该用户生日在日期范围内");
//            }

//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public static Calendar getEndTime(Date startDate, Integer beforeDay) {
        Calendar end = new GregorianCalendar();
        if (beforeDay != null) {
            end.setTime(startDate);
            end.add(Calendar.DAY_OF_MONTH, beforeDay);
            end.set(Calendar.HOUR_OF_DAY, 23);
            end.set(Calendar.MINUTE, 59);
            end.set(Calendar.SECOND, 59);
        }
        return end;
    }
    public static Calendar getStartTime(Date startDate) {
        Calendar start = new GregorianCalendar();
        start.setTime(startDate);
        start.set(Calendar.HOUR_OF_DAY, 0);
        start.set(Calendar.MINUTE, 0);
        start.set(Calendar.SECOND, 0);
        return start;
    }
}
