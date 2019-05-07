package com.xj.demo.basicjava.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by zxj on 2017/2/23.
 */

/**
 * 迭代器Iterator遍历集合时，不能对集合进行修改，
 * 因为迭代器是不知道集合被修改了的，所以会报错、
 * 遍历并修改集合内容有两总方法：
 * 1、迭代器遍历，迭代器修改；
 * 2、集合遍历，集合修改；
 * （不能迭代器遍历，集合修改）
 */
public class MyIterator {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("aa");
        myList.add("bb");
        myList.add("cc");
        myList.add("dd");
        myList.add("ee");
        //1、迭代器遍历，迭代器修改；
        ListIterator<String> listIterator = myList.listIterator();
        while(listIterator.hasNext()){
            String s = listIterator.next();
            System.out.println(s);
            if(s.equals("dd")){
                listIterator.add("ff");
            }
        }
        //2、集合遍历，集合修改；
        for(int i=0;i<myList.size();i++){
            if(myList.get(i).equals("dd")){
                myList.add("ff");
            }
        }
//        //（不能迭代器遍历，集合修改）
//        Iterator<String> iterator = myList.iterator();
//        while(iterator.hasNext()){
//            iterator.next();
//            if(iterator.next().equals("dd")){
//                myList.add("ff");
//            }
//        }
    }

}
