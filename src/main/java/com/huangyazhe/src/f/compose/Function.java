package com.huangyazhe.src.f.compose;

/**
 * Created with IntelliJ IDEA.
 * User: huangyazhe
 * Date: 2018/11/8
 * Time: 21:22
 */
public interface Function<T, U> {
    U apply(T arg);
}
