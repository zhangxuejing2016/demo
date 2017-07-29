package com.xj.demo.basicjava.MyQueue;


import com.alibaba.fastjson.JSON;
import org.durcframework.core.util.DateUtil;
import sun.misc.Request;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.Queue;

/**
 * 使用队列模拟银行排队业务
 * Created by zxj on 2017/3/22.
 */
public class QueueDemo {
    public static void main(String[] args) {

        String dateStr = "2017-03-29";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        for(int i=0; i<1000; i++){
//            try {
//                Date date = format.parse(dateStr);
//                System.out.println(JSON.toJSON(date));
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }
//
//        }

        for(int i=0; i<3000; i++){
            try {
                Date date = DateUtil.convertStringToDate(dateStr, "yyyy-MM-dd");
                System.out.println(format.format(date));
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
    }

}
