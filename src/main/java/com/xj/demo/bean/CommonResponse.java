package com.xj.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by zxj on 2017/3/29.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResponse<T> {

    private int status;

    private String message;

    private String url;

    T data;
}
