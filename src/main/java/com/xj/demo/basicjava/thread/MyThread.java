package com.xj.demo.basicjava.thread;

/**
 * Created by zxj on 2016/11/9.
 */
public class MyThread implements Runnable{

    private int num = 0;
    private boolean flag = true;

    @Override
    public void run() {
        while(flag){
            System.out.println(Thread.currentThread().getName() +"===>"+ num++);
        }
    }

    public void stop(){
        this.flag = !this.flag;
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread proxy = new Thread(myThread,"it");
//        proxy.setName("test");
        System.out.println(proxy.getName());
        System.out.println(Thread.currentThread().getName());
        proxy.start();
        Thread.sleep(200);
        System.out.println("before stop status is :"+proxy.isAlive());
//        myThread.stop();
        proxy.stop();
        Thread.sleep(500);
        System.out.println("after stop status is :"+proxy.isAlive());
    }

}
