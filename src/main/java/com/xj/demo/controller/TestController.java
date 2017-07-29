package com.xj.demo.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by zxj on 2016/10/26.
 */
//@log4j
@Controller
public class TestController {

    @RequestMapping("/getUser")
    @ResponseBody
    public String test(){
        return "hello......";
    }

    private static final Logger log = Logger.getLogger(Action.class);

    public static void main(String[] args) throws NoSuchMethodException {
        String classPath = "com.xj.demo.domain.User";
        try {
            //获取类信息
            Class clazz = Class.forName(classPath);
            System.out.println(clazz.getClasses());
            System.out.println(clazz.getName());//package name + class name
            System.out.println(clazz.getSimpleName());//only class name
            log.info("hah ");

            //获取属性信息
            Field[] declearFields = clazz.getDeclaredFields();
            Field[] publicFields = clazz.getFields();
            System.out.println(declearFields.length);
            System.out.println(publicFields.length);
            for(Field temp : declearFields){
                System.out.println("属性:"+temp);
            }

            //获取方法信息
            Method[] methods = clazz.getDeclaredMethods();
            Method method01 = clazz.getMethod("setPassword",String.class);
            for(Method temp : methods){
                System.out.println("方法:"+temp);
            }

            //获取构造器
            Constructor[] constructors = clazz.getDeclaredConstructors();
            Constructor constructor = clazz.getConstructor(null);
            System.out.println(constructor);
            for(Constructor temp : constructors ){
                System.out.println("构造器:"+temp);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
