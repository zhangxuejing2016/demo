package com.xj.demo.basicjava.designmode;

/**
 * Created by Administrator on 2018/5/25.
 */
public class DCLSingleClass {
    private static  DCLSingleClass instance;

    private DCLSingleClass() {
    }

    public static DCLSingleClass getInstance(){
        if(null == instance){
            synchronized (DCLSingleClass.class){
                if(null == instance){
                    instance = new DCLSingleClass();
                }
            }
        }
        return instance;
    }
}
