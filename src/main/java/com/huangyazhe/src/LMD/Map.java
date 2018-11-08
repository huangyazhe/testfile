package com.huangyazhe.src.LMD;


import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * 封装MAP工具类
 * User: huangyazhe
 * Date: 2018/11/3
 * Time: 22:04
 */
public class Map<T,U> {

    private final ConcurrentMap<T,U> map = new ConcurrentHashMap<T, U>();

    public  Map<T, U> add(Map<T,U> m, T t , U u){
        m.map.put(t,u);
        return m;
    }

    public  Map<T,U> put(T t, U u){
        return add(this,t,u);
    }
}
