package com.xj.demo.bean;

import com.xj.demo.annotations.FruitColor;
import com.xj.demo.annotations.FruitName;
import lombok.Data;

/**
 * Created by Administrator on 2017/7/28.
 */
@Data
public class Apple {

    @FruitName(value = "red-apple")
    private String name;

    @FruitColor(fruitColor = FruitColor.Color.RED)
    private String color;

    public static void displayName(String name){
        System.out.println(name);
    }

}
