package com.xj.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/14.
 */
public enum CardTemplateStatusEnum {
    ALL(-1,"全部"),
    ACTIVE_PUBLISHED(1,"已投放"),
    ACTIVE_UN_PUBLISHED(2,"未投放"),
    INACTIVE(3,"关闭"),
    WE_CHAT_CHECK(4,"审核中"),
    WE_CHAT_CHECK_FAILED(5,"审核失败"),
    DELETED(6,"删除");

    private Integer code;
    private String value;

    private CardTemplateStatusEnum(Integer code,String value){
        this.code = code;
        this.value = value ;
    }

    public Integer getCode() {
        return code;
    }


    public String getValue() {
        return value;
    }

    private static final Map<Integer, String> stringToEnum = new HashMap<Integer, String>();
    static {
        for (CardTemplateStatusEnum status : CardTemplateStatusEnum.values()) {
            stringToEnum.put(status.getCode(), status.getValue());
        }
    }

    // Returns Operation for string, or null if string is invalid
    public static String getDisplayName(Integer symbol) {
        return stringToEnum.get(symbol);
    }
}
