package com.xj.demo.basicjava.designmode;

/**
 * Created by Administrator on 2018/5/25.
 */
public class SupperSingleClass {

    private static class InnerClass{
        private static final SupperSingleClass instance = new SupperSingleClass();
    }

    private SupperSingleClass() {
    }

    public static SupperSingleClass getInstance(){
        return InnerClass.instance;
    }
}
