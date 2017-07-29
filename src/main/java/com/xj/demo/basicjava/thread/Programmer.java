package com.xj.demo.basicjava.thread;

/**
 * Created by zxj on 2016/11/7.
 */
public class Programmer implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("I am a programmer...");
        }
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        Thread thread = new Thread(programmer);
        thread.start();
        for(int i=0;i<100;i++){
            System.out.println("Main method...");
        }
    }

}
