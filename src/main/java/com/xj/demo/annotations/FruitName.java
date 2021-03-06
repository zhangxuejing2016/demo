package com.xj.demo.annotations;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/7/28.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {

    String value() default "";
}
