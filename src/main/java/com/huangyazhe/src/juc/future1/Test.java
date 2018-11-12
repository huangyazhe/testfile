package com.huangyazhe.src.juc.future1;

import com.google.common.collect.Maps;
import com.huangyazhe.src.juc.future1.domain.ShopInfo;
import com.huangyazhe.src.juc.future1.domain.UserInfo;
import com.huangyazhe.src.juc.future1.service.ShopService;
import com.huangyazhe.src.juc.future1.service.UserService;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * HI 雅哲，别忘记写注释哦，认真是一种态度
 * @author HuangYazhe
 * Date: 2018/11/12
 */
public class Test {
    private AsyncTaskExecutor asyncTaskExecutor;
    public static void main(String[] args) {
        AsyncTaskExecutor asyncTaskExecutor = new SimpleAsyncTaskExecutor();
        UserService userService = new UserService();
        ShopService shopService = new ShopService();

        FutureMap<String, Future<Object>> futureMap = new FutureMap<>();
        futureMap.put("userInfo", asyncTaskExecutor.submit(() -> userService.getUserInfo("id")));
        futureMap.put("shopInfo", asyncTaskExecutor.submit(()-> shopService.getShopInfo("id")));

        Map<String, Object> result = Maps.newHashMap();
        try {
            futureMap.forEach((key, value) -> result.put(key, value.get(2000, TimeUnit.MILLISECONDS)));
        }catch (Exception e){
            System.out.println("--Exception-->"+e);
        } finally {
            try {
                futureMap.forEach((key, value) -> value.cancel(true));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        UserInfo userInfo = (UserInfo) result.get("userInfo");
        ShopInfo shopInfo = (ShopInfo) result.get("shopInfo");

        System.out.println(userInfo.toString());
        System.out.println(shopInfo.getShopName());
    }

}
