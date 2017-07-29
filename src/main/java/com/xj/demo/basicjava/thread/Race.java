package com.xj.demo.basicjava.thread;

import java.util.concurrent.Callable;

/**
 * Created by zxj on 2016/11/7.
 */
public class Race implements Callable<Integer> {

    private String name;
    private Long time;
    private boolean flag = true;
    private int step = 0;

    @Override
    public Integer call() throws Exception {
        while(flag){
            Thread.sleep(1000);
            step++;
        }
        return step;
    }

    public Race() {
    }

    public Race(String name, Long time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }


}
