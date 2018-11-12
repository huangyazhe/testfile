package com.huangyazhe.src.juc.future1.domain;

/**
 * HI 雅哲，别忘记写注释哦，认真是一种态度
 * @author HuangYazhe
 * Date: 2018/11/12
 */
public class ShopInfo {
    private String shopName;
    private Integer shopType;

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getShopType() {
        return shopType;
    }

    public void setShopType(Integer shopType) {
        this.shopType = shopType;
    }

    @Override
    public String toString() {
        return "ShopInfo{" + "shopName='" + shopName + '\'' + ", shopType=" + shopType + '}';
    }
}
