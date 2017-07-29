package com.xj.demo.bean;

import lombok.Data;

/**
 * Created by zxj on 2017/3/29.
 */
@Data
public class CommonResponse<T> {

    private int status;

    private String message;

    private String url;

    T data;
}
