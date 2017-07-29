package com.xj.o2o;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zxj on 2017/5/10.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardPackageWithCardDetail implements Serializable{
    private CardPackage cardPackage;
    private List<CardsForCardPackage> cardList;

    public static void main(String[] args) {
        CardPackageWithCardDetail cardPackageWithCardDetail = new CardPackageWithCardDetail();
        CardPackage cardPackage1 = new CardPackage();
        cardPackage1.setMerchantId(1129L);
        cardPackage1.setId(1L);
        cardPackage1.setImg("http://");
        cardPackage1.setIsWechat(0);
        cardPackage1.setName("券包1");
        cardPackage1.setStatus(0);
        cardPackage1.setType(1);
        cardPackage1.setCreateTime(new Date());
        cardPackage1.setUpdateTime(new Date());

        List<CardsForCardPackage> list = new ArrayList<CardsForCardPackage>();
        CardsForCardPackage cardsForCardPackage = new CardsForCardPackage();
        cardsForCardPackage.setType(1);
        cardsForCardPackage.setName("卡模板1");
        cardsForCardPackage.setExpireTime("不过期");
        cardsForCardPackage.setId(11L);
        cardsForCardPackage.setLimit(1);
        cardsForCardPackage.setNum(10);
        cardsForCardPackage.setSynchType(0);
        list.add(cardsForCardPackage);

        CardsForCardPackage cardsForCardPackage1 = new CardsForCardPackage();
        cardsForCardPackage1.setType(0);
        cardsForCardPackage1.setName("卡模板2");
        cardsForCardPackage1.setExpireTime("不过期");
        cardsForCardPackage1.setId(11L);
        cardsForCardPackage1.setLimit(2);
        cardsForCardPackage1.setNum(5);
        cardsForCardPackage1.setSynchType(1);
        list.add(cardsForCardPackage1);

        cardPackageWithCardDetail.setCardList(list);
        cardPackageWithCardDetail.setCardPackage(cardPackage1);
        System.out.println(JSON.toJSON(cardPackageWithCardDetail));
    }
}
