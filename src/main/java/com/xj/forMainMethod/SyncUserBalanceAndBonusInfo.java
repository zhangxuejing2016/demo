package com.xj.forMainMethod;

import com.alibaba.fastjson.JSON;
import lombok.Data;

/**
 * Created by zxj on 2017/4/13.
 */
@Data
public class SyncUserBalanceAndBonusInfo {
    private String code;
    private String card_id;
    private Integer add_bonus;
    private Integer bonus;
    private String record_bonus;
    private Integer add_balance;
    private Integer balance;
    private String record_balance;
    private String background_pic_url;
    private String custom_field_value1;
    private String custom_field_value2;
    private String custom_field_value3;
    private NotifyOptional notify_optional;

    public static void main(String[] args) {
        SyncUserBalanceAndBonusInfo s = new SyncUserBalanceAndBonusInfo();
        NotifyOptional n = new NotifyOptional();
        n.setIs_notify_balance(true);
        n.setIs_notify_bonus(true);
        n.setIs_notify_custom_field1(true);
        n.setIs_notify_custom_field2(false);
        n.setIs_notify_custom_field3(false);
        s.setNotify_optional(n);
        s.setCode("12345678");
        s.setCard_id("111111");
        s.setAdd_bonus(111);
        s.setBonus(123);
        s.setRecord_bonus("123");
        s.setAdd_balance(111);
        s.setBalance(111);
        s.setRecord_balance("123");
        s.setBackground_pic_url("http");
        s.setCustom_field_value1("123");
        s.setCustom_field_value2("123");
        s.setCustom_field_value3("123");
        System.out.println(JSON.toJSON(s));
    }

}
