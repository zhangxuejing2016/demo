package com.xj.demo.basicjava.thread;

import java.math.BigDecimal;

/**
 * 模拟网络延时-线程不安全的
 * Created by zxj on 2016/11/9.
 */
public class Web12306 implements Runnable{

    private int num = 10;
    private boolean flag = true;

    @Override
    public void run() {
        while(flag){
            try {
                test1();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void test1() throws InterruptedException {
        if(num < 0){
            flag = false;
            return;
        }
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName()+"  got the ticket  "+num--);
    }

    public synchronized void test2() throws InterruptedException {
        if(num <= 0){
            flag = false;
            return;
        }
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName()+"  got the ticket  "+num--);
    }

    public static void main(String[] args) {
//        Web12306 web12306 = new Web12306();
//        Thread t1 = new Thread(web12306,"小甲");
//        Thread t2 = new Thread(web12306,"小yi");
//        Thread t3 = new Thread(web12306,"小bing");
//        t1.start();
//        t2.start();
//        t3.start();

        Long b = -10L;
        System.out.println(String.valueOf(b));
    }

}
