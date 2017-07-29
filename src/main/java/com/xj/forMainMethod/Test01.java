package com.xj.forMainMethod;

import com.xj.demo.annotations.FruitColor;
import com.xj.demo.annotations.FruitName;
import com.xj.demo.bean.Apple;

import java.lang.reflect.Field;

/**
 * Created by Administrator on 2017/7/28.
 */
public class Test01 {
    public static void main(String[] args) {
        String strFruitName=" 水果名称：";
        String strFruitColor=" 水果颜色：";

        Field[] fields = Apple.class.getDeclaredFields();
        for(Field field:fields){
            if(field.isAnnotationPresent(FruitName.class)){
                FruitName fruitName = field.getAnnotation(FruitName.class);
                strFruitName = strFruitName + fruitName.value();
                System.out.println(strFruitName);
            }else if(field.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                strFruitColor = strFruitColor + fruitColor.fruitColor();
                System.out.println(strFruitColor);
            }
        }
    }
}
