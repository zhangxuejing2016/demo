package com.xj.demo.basicjava.Collection;

/**
 * Created by zxj on 2016/10/31.
 * (自己定义实现ArrayList)
 */
public class MyArrayList {

    private Object[] elementData;

    private int size;

    public MyArrayList() {
        this(10);
    }

    public MyArrayList(int initalCapacity) {
        if(initalCapacity<0){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        elementData = new Object[initalCapacity];
    }

    public void add(Object obj){
        //数组扩容
        if(size==elementData.length){
            Object[] newArray = new Object[size*2+1];
            System.arraycopy(elementData,0,newArray,0,elementData.length);
            elementData = newArray;
        }
        elementData[size++] = obj;
    }

    public Object get(int index){
        if(index < 0 || index >= size){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return elementData[index];
    }

    public void remove(int index){
        if(index < 0 || index >= size){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int numMove = size-index-1;
        if(numMove > 0){
            System.arraycopy(elementData,index+1,elementData,index,numMove);
        }
        elementData[--size] = null;
    }


    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(3);
        list.add(123);
        list.add("111");
        list.add("122");
        list.add("133");
        list.add("144");
        System.out.println(list.get(3));
    }

}
