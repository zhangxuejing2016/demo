package com.xj.demo.basicjava.thread;

/**
 * 创建多线程,模拟龟兔赛跑
 * Created by zxj on 2016/11/7.
 */
public class Rabbit extends Thread{

    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("兔子跑了"+i+"步");
        }
    }

    public static void main(String[] args){
        Rabbit rabbit = new Rabbit();
        Tortoise tortoise = new Tortoise();

        rabbit.start();
        tortoise.start();

        for(int i=0;i<100;i++){
            System.out.println("main===> "+i);
        }
    }

}

