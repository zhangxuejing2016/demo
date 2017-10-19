package com.xj.forMainMethod;

import com.alibaba.fastjson.JSON;
import com.xj.utils.DateUtils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created Created by zxj on 2017/10/12 16:24.
 */
public class ForTime {
    public static void main(String[] args) {
        Date birthday = DateUtils.getDateFromStr(DateUtils.dateToString(DateUtils.getDateFromStr("2017-12-31", "yyyy-MM-dd"),"MM-dd"),"MM-dd");
        Calendar start = new GregorianCalendar();
        start.setTime(birthday);
        start.add(Calendar.DAY_OF_MONTH, 0);
        start.set(Calendar.HOUR_OF_DAY, 12);
        start.set(Calendar.MINUTE, 0);
        start.set(Calendar.SECOND, 0);
        start.set(Calendar.MILLISECOND, 0);
        System.out.println(JSON.toJSONString(start.getTime()));
        System.out.println(start.get(Calendar.DAY_OF_MONTH));
        System.out.println(start.get(Calendar.MONTH));
    }
}
