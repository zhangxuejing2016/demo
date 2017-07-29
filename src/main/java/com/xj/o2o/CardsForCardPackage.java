package com.xj.o2o;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by zxj on 2017/5/10.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardsForCardPackage implements Serializable{
    private Long id;
    //卡券名称
    private String name;
    //卡券数量
    private Integer num;
    //卡券类型
    private Integer type;
    //有效期时间
    private String expireTime;
    //每人限领数量
    private Integer limit;
    //LOCAL_SYSTEM 0 ,weixin 1
    private int synchType;
}
