package com.xj.o2o;

import lombok.Data;

import java.util.List;

/**
 * Created by Administrator on 2018/1/20.
 */
@Data
public class MemberFilterBean {
    private Long pid;//商户Id
    private Integer beforeDay;//商户Id
    private List<Long> rankIds;//会员等级条件
    private List<Integer> status;//会员状态条件
    private List<String> wids;//会员wid（非滚动筛选时传入）
}
