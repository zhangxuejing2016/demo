package com.xj.demo.basicjava.thread;

/**
 * Created by zxj on 2016/11/7.
 */
public class MarrayCompany implements Marray {

    private Marray you;

    public MarrayCompany(Marray you) {
        this.you = you;
    }

    public MarrayCompany() {
    }

    public void before(){
        System.out.println("before......");
    }

    public void after(){
        System.out.println("after......");
    }

    @Override
    public void marray() {
        before();
        you.marray();
        after();
    }

    /**
     * static proxy静态代理设计模式
     * 1\真实角色
     * 2\代理角色
     * 3\二者实现相同的接口
     */
    public static void main(String[] args) {

        //创建真实角色
        You you = new You();
        //创建代理角色
        MarrayCompany marrayCompany = new MarrayCompany(you);
        marrayCompany.marray();

    }

}
