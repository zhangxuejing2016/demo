package com.xj.demo.basicjava.designmode;

/**
 * Created by Administrator on 2018/5/25.
 */
public class LazySingleClass {
    private static LazySingleClass instance;

    private LazySingleClass() {
    }

    public static synchronized LazySingleClass getInstance(){
        if(instance == null){
            instance = new LazySingleClass();
        }
        return instance;
    }
}
