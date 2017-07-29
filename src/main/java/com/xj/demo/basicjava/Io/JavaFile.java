package com.xj.demo.basicjava.Io;

import java.io.File;
import java.io.IOException;

/**
 * Created by zxj on 2017/2/8.
 */
public class JavaFile {
    public static void main(String[] args) {
        //获取文件路径
//        File file = new File("d://others");
//        if(file.isDirectory()){
//            System.out.println(file.getPath());
//            System.out.println(file.getName());
//        }
        //创建文件
        //不同的系统斜杠的方向不同，考虑到跨平台问题，所以使用File.separator静态字段
//        File file = new File("d:"+File.separator+"io_new.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        File file = new File("d:/others");
        find(file);

    }

    public static void find(File file){
        if(file.isDirectory()){
            File[] f = file.listFiles();
            for(int i=0;i<f.length-1;i++){
                if(f[i].isDirectory()){
                    find(f[i]);
                }
            }
            System.out.println(f);
        }else {
            System.out.println(file);
        }

    }
}