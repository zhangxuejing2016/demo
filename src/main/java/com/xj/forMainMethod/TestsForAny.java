package com.xj.forMainMethod;

/**
 * Created by Administrator on 2018/9/26.
 */
public class TestsForAny {

    public static void main(String[] args) {
        // 创建两个线程
        DeadLockThread dt1 = new DeadLockThread(false);
        DeadLockThread dt2 = new DeadLockThread(true);
        // 启动线程
        new Thread(dt1).start();
        new Thread(dt2).start();
    }

    static class DeadLockThread implements Runnable {
        // 标记变量
        private boolean flag;

        public DeadLockThread(boolean flag) {
            super();
            this.flag = flag;
        }

        public void run() {
            // dt1线程执行该方法
            if (flag) {
                synchronized (ThreadLock.locka) {
                    System.out.println("if locka!");
                    synchronized (ThreadLock.lockb) {
                        System.out.println("if lockb!");
                    }
                }
            } // dt2线程执行该方法
            else {
                synchronized (ThreadLock.lockb) {
                    System.out.println("else lockb!");
                    synchronized (ThreadLock.locka) {
                        System.out.println("else locka!");
                    }
                }
            }
        }
    }

    static class ThreadLock {
        static Object locka = new Object();
        static Object lockb = new Object();
    }


}
