package com.xj.demo.basicjava;

import com.alibaba.fastjson.JSON;
import com.xj.utils.DateUtils;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by zxj on 2016/10/28.
 */
public class practices {

//    public static void main(String[] args) throws ScriptException, NoSuchMethodException {
//
//        //获得脚本引擎对象
//        ScriptEngineManager sem = new ScriptEngineManager();
//        ScriptEngine engine = sem.getEngineByName("javascript");
//
//        //定义变量,存储到引擎上下文中
//        engine.put("msg","hello");
//        String str = "var user = {name:'高琪',age:18,schools:['sxt','Hafu']};";
//        str += "println(user.name);";
//
//        //执行脚本
//        engine.eval(str);
//        engine.eval("msg = 'sxt is a school';");
//        System.out.println(engine.get("msg"));
//
//        //定义并执行函数
//        engine.eval("function add(a,b){return a+b}");
//        Invocable jsInvocake = (Invocable) engine;
//        Object result = jsInvocake.invokeFunction("add", new Object[]{20, 20});
//        System.out.println(result);
//
//        System.out.println(Arrays.toString(args));
//    }

    private static Long get() throws ParseException {
        String refDateStr = "2017-04-01";
        String endDate = "2017-04-05";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        List<Date> list = new ArrayList<Date>();
        list.add(format.parse("2017-04-01"));
        Date refDate = format.parse(refDateStr);
        for (Date cumulateVo : list) {
            if (cumulateVo.compareTo(refDate) == 0) {
                //当前关注总人数
                System.out.println("11L");
                return 11L;
            } else {
                continue;
            }
        }
        System.out.println("未获取到对应日期 [%s]的关注总人数" + refDate.toString());
        return 0L;
    }

    public static void main(String[] args) throws ParseException {
//        Date birthday = DateUtils.getDateFromStr(DateUtils.dateToString(new Date(),"MM-dd"),"MM-dd");
//        Calendar start = new GregorianCalendar();
//        start.setTime(birthday);
//        start.set(Calendar.HOUR_OF_DAY, 0);
//        start.set(Calendar.MINUTE, 0);
//        start.set(Calendar.SECOND, 0);
//        start.set(Calendar.MILLISECOND, 0);
//
//        Calendar end = new GregorianCalendar();
//        end.setTime(birthday);
//        end.add(Calendar.DAY_OF_MONTH, 3);
//        end.set(Calendar.HOUR_OF_DAY, 23);
//        end.set(Calendar.MINUTE, 59);
//        end.set(Calendar.SECOND, 59);
//        System.out.println(start.getTime());
//        System.out.println(end.getTime());
        Date date = new Date();
        Date date1 = null;
        System.out.println(date);
        System.out.println(JSON.toJSONString(date));
        System.out.println(date1);
        System.out.println(Long.valueOf(JSON.toJSONString(date)));
    }}

//        String refDateStr = "2017-05-03";
//        String cumulateVoDate = "2017-05-03 00:00:00";
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        Date refdate = format.parse(refDateStr);
//        if(format.parse(cumulateVoDate).compareTo(refdate) == 0){
//            //当前关注总人数
//            System.out.println("未获取到对应日期 [%s]的关注总人数"+refdate.toString());
//        }else {
//            System.out.println("hha");
//        }

//            while(refDateStr.compareTo(endDate) <= 0){
//                Date refdate = format.parse(refDateStr);
//                System.out.println(format.format(refdate));
//
//                refDateStr = format.format(DateUtils.getNextDay(format.parse(refDateStr)));
//                System.out.println(refDateStr);
//            }

//        List<String> openIds = new ArrayList<>();
//        for(int i=0; i<45345; i++ ){
//            openIds.add("aaa"+i);
//        }
//        //群发消息每次最多发给一万个用户，超过一万需分�