package com.xj.demo.basicjava.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 使用Collable创建线程
 * Created by zxj on 2016/11/7.
 */
public class Call {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建线程
        ExecutorService ser = Executors.newFixedThreadPool(2);
        Race tortoise = new Race("小乌龟",1000L);
        Race rabbit = new Race("小兔子",500L);
        //获取值
        Future<Integer> result1 = ser.submit(tortoise);
        Future<Integer> result2 = ser.submit(rabbit);

        Thread.sleep(2000);
        tortoise.setFlag(false);
        rabbit.setFlag(false);

        Integer num1 = result1.get();
        Integer num2 = result2.get();
        System.out.println("The little tortoise has runned  "+num1+"steps");
        System.out.println("The little rabbit has runned  "+num2+"steps");
        ser.shutdownNow();
    }

}
