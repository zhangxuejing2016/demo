package com.xj.forMainMethod;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Administrator on 2018/9/17.
 */
@Slf4j
public class Test {
    public static void main(String[] args){
        String a = "a";
        String b = "a";
        System.out.println(a == b);
        System.out.println("a" == "a");
//        Long a[] = {-1L,-2L,-3L,0L,1L,3L,5L,2L,4L,6L,7L};
//        System.out.println(maxThreeTwo(a));
    }

    public static Long maxThreeTwo(Long a[]){
        //排序
        selectSort(a);
        for(int i=0; i<a.length; i++){
            System.out.println("第" + i + "个数："+a[i]);
        }
        //找出最大的三个数
        Long pr1 = a[a.length-1] * a[a.length-2] * a[a.length-3];
        //找出最小的两个数
        Long pr2 = a[0] * a[1] * a[a.length-1];
        //比较最大的三个数乘积与最小两个数与最大数的乘积相比较，返回大值
        return pr1.compareTo(pr2)>=0?pr1:pr2;
    }

    //选择排序
    public static void selectSort(Long[] a){
        for(int i=0; i<a.length-2; i++){
            int k = i;
            for(int j=i+1; j<a.length-1; j++){
                if(a[i] > a[j]){
                    k = j;
                }
            }
            if(i != k){
                Long temp = a[i];
                a[i] = a[k];
                a[k] = temp;
            }
        }
    }



    public static long maxThreeOne(Integer a[])
    {
        int maxIndex = 0;//最大数的下标
        int minIndex = 0;//最小值的下标
        for(int i=1;i<a.length;i++)
        {
            if(a[minIndex] > a[i])
                minIndex = i;
            else if(a[maxIndex] < a[i])
                maxIndex = i;
        }

        long result=1;
        if(a[maxIndex] <= 0||a[minIndex] >= 0) {
            result=result * a[maxIndex];
            long temp1=Long.MIN_VALUE;//数组第二大的值
            int index=-1;
            for(int i=0;i<a.length;i++)
            {
                if(i != maxIndex && a[i] > temp1)
                {
                    temp1 = a[i];
                    index = i;
                }
            }
            result = result * temp1;
            temp1 = Long.MIN_VALUE;//数组第三大的值
            int index2 = -1;
            for(int i=0;i<a.length;i++)
            {
                if(i != maxIndex && i != index && a[i] > temp1)
                {
                    temp1 = a[i];
                    index2 = i;
                }
            }
            result = result * temp1;
            return result;
        } else if(a[maxIndex] > 0 && a[minIndex] < 0) {
            long min2 = Long.MAX_VALUE,min2Index=-1;//数组的第二小值对应的值和下标
            long max2 = Long.MIN_VALUE,max2Index=-1;//数组的第二大值对应的值和下标
            long max3 = Long.MIN_VALUE,max3Index=-1;//数组的第三大值对应的值和下标
            for(int i=0;i<a.length;i++)
            {
                if(i != minIndex && a[i] < min2)
                {
                    min2 = a[i];
                    min2Index = i;
                }
                if(i != maxIndex && a[i] > max2)
                {
                    max2 = a[i];
                    max2Index = i;
                }
            }
            for(int i=0;i<a.length;i++)
            {
                if(i != maxIndex && i != max2Index && a[i] > max3)
                {
                    max3 = a[i];
                    max3Index = i;
                }
            }
            long result1 = a[minIndex] * min2 * a[maxIndex];
            long result2 = a[maxIndex] * max2 * max3;
            return result1 > result2 ? result1:result2;
        }
        return 0;
    }

}
