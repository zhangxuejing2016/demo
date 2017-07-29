package com.xj.demo.basicjava.Collection;

import java.util.HashMap;

/**
 * Created by zxj on 2017/2/12.
 */
public class HashSet {
    HashMap map;
    public static final Object PREZENT = new Object();

    public HashSet(){
        map = new HashMap();
    }

    public void add(Object o){
        map.put(o,PREZENT);//set的不可重复是利用map中键对象不可重复
    }
}
