package com.xj.forMainMethod;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by zxj on 2017/4/13.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotifyOptional {
    private Boolean is_notify_bonus;
    private Boolean is_notify_balance;
    private Boolean is_notify_custom_field1;
    private Boolean is_notify_custom_field2;
    private Boolean is_notify_custom_field3;
}
