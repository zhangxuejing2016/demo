package com.xj;

import com.alibaba.fastjson.JSON;
import com.xj.demo.domain.User;
import com.xj.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zxj on 2017/2/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-test.xml")
public class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    public void saveTest() {
        BigDecimal amountString = new BigDecimal("0.05");
        BigDecimal depositAmountConsume = amountString.multiply(new BigDecimal("0.76"));
        System.out.println("订单金额：" + amountString);
        System.out.println("实充锁定：" + depositAmountConsume);
        System.out.println("赠送锁定：" + amountString.subtract(depositAmountConsume.setScale(2,BigDecimal.ROUND_DOWN)));
        User u = new User();
        u.setMoney(depositAmountConsume);
        u.setUsername("xj");
        u.setPassword("123");
        u.setNickname("Cola");
        u.setAge(26);
        u.setBirthday(new Date());
        System.out.println(JSON.toJSONString(depositAmountConsume));
        userService.insertSelective(u);

//        String hh = String.format("http://o2oqa.stc.dev.weimob.com/h5",1129);
//        System.out.println(hh);
//        {  // 普通代码块
//            int x = 30 ; // 就属于一个局部变量
//            System.out.println("普通代码块 --> x = " + x) ;
//        }
//        int x = 100 ;  // 与局部变量名称相同
//        System.out.println("代码块之外 --> x = " + x) ;

//                 //创建JSONObject对象
//                JSONObject json = new JSONObject();
//
//                //向json中添加数据
//                json.put("username", "wanglihong");
//                json.put("height", 12.5);
//                json.put("age", 24);
//
//                //转换为字符串
//                String jsonStr = json.toString();

//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date now = new Date();
//        Date afterDate = new Date(now .getTime() + 60*60*1000);
//        System.out.println(format.format(afterDate ));
//        System.out.println(format.format(now));

   }


}
