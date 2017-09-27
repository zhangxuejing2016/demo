package com.xj.websocket;

import lombok.Data;

import java.util.Date;

/**
 * Created Created by zxj on 2017/9/19 16:12.
 */
@Data
public class Message {

    //发送者
    public Long from;
    //发送者名称
    public String fromName;
    //接收者
    public Long to;
    //发送的文本
    public String text;
    //发送日期
    public Date date;

}
