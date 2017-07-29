package com.xj.demo.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by zxj on 2016/11/17.
 */
public class CopyUser {


    private Long copyUserId;

    private String password;

    private String nickname;

    private String gender;

    private Date birthday;

    private Date birthDate;

    private String province;

    public Long getCopyUserId() {
        return copyUserId;
    }

    public void setCopyUserId(Long copyUserId) {
        this.copyUserId = copyUserId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

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
