package com.xj.demo.domain;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zxj on 2017/2/27.
 */
@Data
public class Test {

    public static void main(String[] args) {
//        String hh = String.format("http://o2oqa.stc.dev.weimob.com/h5",1129);
//        System.out.println(hh);
//        {  // 普通代码块
//            int x = 30 ; // 就属于一个局部变量
//            System.out.println("普通代码块 --> x = " + x) ;
//        }
//        int x = 100 ;  // 与局部变量名称相同
//        System.out.println("代码块之外 --> x = " + x) ;

//                 //创建JSONObject对象
//                JSONObject json = new JSONObject();
//
//                //向json中添加数据
//                json.put("username", "wanglihong");
//                json.put("height", 12.5);
//                json.put("age", 24);
//
//                //转换为字符串
//                String jsonStr = json.toString();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        Date afterDate = new Date(now .getTime() + 60*60*1000);
        System.out.println(format.format(afterDate ));
        System.out.println(format.format(now));

    }


}
