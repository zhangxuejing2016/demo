package com.xj.forMainMethod;

import com.xj.utils.DateUtils;
import org.apache.commons.collections.CollectionUtils;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created Created by zxj on 2017/9/25 17:57.
 */
public class ForLoop {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("JavaWeb编程词典");        //向列表中添加数据
        list.add("Java编程词典");        //向列表中添加数据
        list.add("C#编程词典");         //向列表中添加数据
        list.add("ASP.NET编程词典");        //向列表中添加数据
        list.add("VC编程词典0000");         //向列表中添加数据
        list.add("VC编程词典1111");         //向列表中添加数据
        list.add("VC编程词典22222222222");         //向列表中添加数据
        list.add("VC编程词典3333333");         //向列表中添加数据
        list.add("VC编程词典444444");         //向列表中添加数据
        list.add("VC编程词典55555");         //向列表中添加数据
        list.add("VC编程词典66666666666");         //向列表中添加数据
        list.add("VC编程词典7777777");         //向列表中添加数据
        list.add("VC编程词典8888888");         //向列表中添加数据
        list.add("VC编程词典99999999");         //向列表中添加数据
        list.add("SQL编程词典1111");        //向列表中添加数据
        list.add("SQL编程词典222");        //向列表中添加数据
        list.add("SQL编程词典3333333");        //向列表中添加数据
        list.add("SQL编程词典4444444");        //向列表中添加数据
        list.add("SQL编程词典555555");        //向列表中添加数据
        list.add("SQL编程词典666666666");        //向列表中添加数据
        list.add("SQL编程词典777777777");        //向列表中添加数据
        list.add("SQL编程词典888");        //向列表中添加数据
        list.add("SQL编程词典999");        //向列表中添加数据
        list.add("SQL编程词典000");        //向列表中添加数据
//        Iterator<String> its = list.iterator();     //获取集合迭代器
//        System.out.println("集合中所有元素对象：");
//        while (its.hasNext()) {        //循环遍历集合
//            System.out.print(its.next() + "  ");     //输出集合内容
//        }
//        List<String> subList = list.subList(3, 4);    //获取子列表
//        System.out.println("\n截取集合中部分元素：");
//        Iterator it = subList.iterator();
//        while (it.hasNext()) {
//            System.out.print(it.next() + "  ");
//        }
        List<String> batchCustomers = new ArrayList<String>();
        int fromIndex = 0;
        int toIndex = 10;
        for(int i=0; i<list.size()/10; i++){
            System.out.println("====="+i);
            System.out.println("fromIndex"+fromIndex);
            System.out.println("toIndex"+toIndex);
            batchCustomers = list.subList(fromIndex,toIndex);
            for(String str : batchCustomers){
                System.out.println(str);
            }
            fromIndex = toIndex;
            toIndex = (i+1)*10;
            System.out.println("====="+i);
        }

    }
}
