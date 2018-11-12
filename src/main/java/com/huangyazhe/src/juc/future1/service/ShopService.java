package com.huangyazhe.src.juc.future1.service;

import com.huangyazhe.src.juc.future1.domain.ShopInfo;

/**
 * HI 雅哲，别忘记写注释哦，认真是一种态度
 * @author HuangYazhe
 * Date: 2018/11/12
 */
public class ShopService {
    public ShopInfo getShopInfo(String id){

        ShopInfo shopInfo = new ShopInfo();
        shopInfo.setShopName("shopName");
        shopInfo.setShopType(11);

        return shopInfo;
    }
}
