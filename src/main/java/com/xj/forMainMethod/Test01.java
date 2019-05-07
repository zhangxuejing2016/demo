package com.xj.forMainMethod;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xj.demo.annotations.FruitColor;
import com.xj.demo.annotations.FruitName;
import com.xj.demo.bean.Apple;
import com.xj.demo.domain.PickArchCallBackBean;
import com.xj.demo.domain.User;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.*;

/**
 * Created by Administrator on 2017/7/28.
 */
public class Test01 {
//    public static int demo(final List list, final int testCount) throws InterruptedException {
//        ThreadGroup group = new ThreadGroup(list.getClass().getName() + "@" + list.hashCode());
//        final Random rand = new Random();
//
//        Runnable listAppender = new Runnable() {
//            public void run() {
//                try {
//                    Thread.sleep(rand.nextInt(2));
//                } catch (InterruptedException e) {
//                    return;
//                }
//                list.add("0");
//            }
//        };
//
//        for (int i = 0; i < testCount; i++) {
//            new Thread(group, listAppender, "InsertList-" + i).start();
//        }
//
//        while (group.activeCount() > 0) {
//            Thread.sleep(10);
//        }
//
//        return list.size();
//    }
//    public static void main(String[] args) throws InterruptedException {
//        List unsafeList = new ArrayList();
//        List safeList = Collections.synchronizedList(new ArrayList());
//        final int N = 10000;
//        for (int i = 0; i < 10; i++) {
//            unsafeList.clear();
//            safeList.clear();
//            int unsafeSize = demo(unsafeList, N);
//            int safeSize = demo(safeList, N);
//            System.out.println("unsafe/safe: " + unsafeSize + "/" + safeSize);
//        }
//    }
public static void main(String[] args) {
    String str = "{\"totalAmount\":6.80,\"wid\":2584861,\"goodsTotalAmount\":6.80,\"goodsList\":[{\"itemId\":0,\"buyNum\":1,\"originalPrice\":6.80,\"salePrice\":6.80,\"goodsId\":118640180,\"goodsTotalAmount\":6.80,\"outerSkuCode\":\"0001001\",\"pid\":3280,\"outerGoodsCode\":\"0001001\",\"storeId\":12000958280,\"skuId\":231340180}],\"pid\":3280,\"storeId\":12000958280}";
    Map object = JSONObject.parseObject(str, Map.class);
    System.out.println(DigestUtils.md5Hex(buildMap(object)));
}

    public static String buildMap(Map<String, String> map) {
        StringBuffer sb = new StringBuffer();
        if (map.size() > 0) {
            for (String key : map.keySet()) {
                sb.append(key + "=");
                if (StringUtils.isEmpty(String.valueOf(map.get(key)))) {
                    sb.append("&");
                } else {
                    String value = String.valueOf(map.get(key));
                    try {
                        value = URLEncoder.encode(value, "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                    sb.append(value + "&");
                }
            }
        }
        return sb.toString();
    }
}