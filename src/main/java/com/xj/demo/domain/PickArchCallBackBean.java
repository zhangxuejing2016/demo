package com.xj.demo.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zxj on 2018/2/7 16:04
 */
@Data
public class PickArchCallBackBean implements Serializable{
    private Integer status;
    private String data_id;
    private List<Long> wids;
}
