package com.xj.forMainMethod;

import com.alibaba.fastjson.JSON;
import com.xj.demo.domain.CopyUser;
import com.xj.demo.domain.User;
import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * Created Created by zxj on 2017/10/20 11:30.
 */
public class PorpertiesCopy {
    public static void main(String[] args) {
        String url = "https://www.alipay.com";
        String alipaySchemaUrl = "alipays://platformapi/startapp?appId=20000021&b=m&p=17324360359";
//        String add = alipaySchemaUrl.substring(21);
        String newUrl = alipaySchemaUrl.replace("https://www.alipay.com","alipays://platformapi");
//        System.out.println(url + add);
        System.out.println(newUrl);
    }
}
