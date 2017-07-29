package com.xj.demo.basicjava.thread;

/**
 * Created by zxj on 2016/11/8.
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        int num = 10;
        while(true){
            System.out.println(num);
            Thread.sleep(1000);
            num--;
            if(num <= 0){
                break;
            }
        }
    }
}
