package com.xj.demo.vo;

import lombok.Data;

import java.util.Date;

/**
 * Created Created by zxj on 2017/9/18 17:05.
 */
@Data
public class UserQuery {
    private Long id;

    private String userName;

    private String passWord;

    private String nickName;

    private String email;

    private Integer age;

    private Date birthday;

    private boolean ha;

    private int count;
}
