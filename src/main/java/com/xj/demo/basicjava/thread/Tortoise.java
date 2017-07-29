package com.xj.demo.basicjava.thread;

/**
 * Created by zxj on 2016/11/7.
 */
public class Tortoise extends Thread{

        @Override
        public void run(){
            for(int i=0;i<100;i++){
                System.out.println("乌龟跑了"+i+"步");
            }
        }


}
