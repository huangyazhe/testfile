package com.huangyazhe.src.commonschain;

/**
 * 描述: 可以扩展一些业务通过组合方式来操作，业务多了，可以添加抽象类
 * @author : huangyazhe
 * Date: 2017/6/9
 */
public class ManagerImpl implements Manager {
    public boolean isVersion(String clientInfo, boolean defaultValue) {
        System.out.println("this ManagerImpl isVersion");
        return false;
    }
}
