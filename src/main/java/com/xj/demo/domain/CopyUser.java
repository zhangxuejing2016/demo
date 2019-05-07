package com.xj.demo.domain;

import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by zxj on 2016/11/17.
 */
@Data
public class CopyUser {


    private Long copyUserId;

    private String password;

    private String nickname;

    private String gender;

    private Date birthday;

    private Date birthDate;

    private String province;

    private String age;

    public CopyUser(String password, String nickname, String gender, Date birthday, Date birthDate, String province) {
        this.password = password;
        this.nickname = nickname;
        this.gender = gender;
        this.birthday = birthday;
        this.birthDate = birthDate;
        this.province = province;
    }

    public CopyUser() {
    }

    public static void main(String[] args) throws ParseException {
//        String beginDate = "2016-08-09";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateFormat.format(new Date());
        System.out.println(date);
    }

}
