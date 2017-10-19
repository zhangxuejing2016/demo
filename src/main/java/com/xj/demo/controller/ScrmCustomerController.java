package com.xj.demo.controller;

import com.xj.demo.domain.ScrmCustomer;
import com.xj.demo.service.CustomerManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created Created by zxj on 2017/9/27 21:08.
 */
@Controller
public class ScrmCustomerController {

    @Autowired
    private CustomerManageService customerManageService;

    @RequestMapping("/customer/batchInsert")
    @ResponseBody
    public String batchInsert(){
        Long merchantId = 1129L;
        List<ScrmCustomer> customers = new ArrayList<ScrmCustomer>();
        for(int i=0; i<3; i++){
            ScrmCustomer scrmCustomer = new ScrmCustomer();
            scrmCustomer.setMerchantId(merchantId);
            scrmCustomer.setAppChannel(i);
            scrmCustomer.setWid("wid" + i);
            scrmCustomer.setUnionId("unionId" + i);
            scrmCustomer.setOpenId("openId" + i);
            scrmCustomer.setScore(0L);
            scrmCustomer.setAvailable(0f);
            scrmCustomer.setSumScore(0L);
            scrmCustomer.setTradeCount(0L);
            scrmCustomer.setAvgAmount(0f);
            scrmCustomer.setAmount(0f);
            scrmCustomer.setIsFocus(1);
            scrmCustomer.setStatus(1);
            scrmCustomer.setFocusSourceType(0);
            scrmCustomer.setFocusStoreId(-1L);
            customers.add(scrmCustomer);
        }
        customerManageService.batchInsert(merchantId,customers);
        return "success";
    }

}
