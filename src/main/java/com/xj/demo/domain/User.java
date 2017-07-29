package com.xj.demo.domain;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.springframework.util.NumberUtils;

import javax.swing.*;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by lenovo on 2016/10/25.
 */
public class User {
    private static final Logger log = Logger.getLogger(Action.class);

    private Long id;

    private String username;

    private String password;

    private String nickname;

    private String email;

    private Integer age;

    private Date birthday;

    private boolean ha;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isHa() {
        return ha;
    }

    public void setHa(boolean ha) {
        this.ha = ha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }


            public void setAge(Integer age) {
                this.age = age;
            }



        public Integer getAge() {
            return age;
        }

    public User(Long id, String username, String password, String nickname, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.email = email;
    }

    public User() {
    }

    public static void main(String[] args) {
        User u = new User();
        u.setNickname("ss");
        System.out.println(u.isHa());

//        //从键盘读入一行字符
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String inputContent = null;
//        System.out.println("Please enter a string:");
//        try {
//            inputContent = bufferedReader.readLine();
//            System.out.println("the string is: "+inputContent);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //读取本地文件并输出
        //默认编码指的是本地编码表，是GBK编码，你通过Eclipse设置的“UTF-8”是你创建文件的编码
//        File file = new File("d:/spring.txt");
//        try {
////            Reader reader = new FileReader(file);
//            FileInputStream fileInputStream = new FileInputStream(file);
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream,"GBK"));
//            String data = null;
//            while((data = bufferedReader.readLine()) != null) {
//                System.out.println(data);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }catch (IOException e) {
//            e.printStackTrace();
//        }


//        User userOne = new User(1L, "name", "password", "nickname", "email");
//        userOne.setAge(20);
//
//        Integer year = userOne.getAge();
//        year = 21;
//        System.out.println(JSON.toJSON(userOne));
//        log.info("hah ");
//        User userTwo = new User(2L, "name2", "password2", "nickname2", "email2");
//        userTwo = userOne;
//        userTwo.setNickname("haha");
//        System.out.println(JSON.toJSON(userOne));

//        DecimalFormat df = new DecimalFormat("#.##");
//        System.out.println(df.format(6.00));

    }
}
