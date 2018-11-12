package com.huangyazhe.src.juc.future1.service;

import com.huangyazhe.src.juc.future1.domain.UserInfo;

/**
 * HI 雅哲，别忘记写注释哦，认真是一种态度
 * @author HuangYazhe
 * Date: 2018/11/12
 */
public class UserService {

    public UserInfo getUserInfo(String id) throws Exception{
        UserInfo userInfo = new UserInfo();
        userInfo.setName("huangzh");
        userInfo.setAge(18);

        return userInfo;

    }

}
