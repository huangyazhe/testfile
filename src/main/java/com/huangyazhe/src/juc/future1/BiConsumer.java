package com.huangyazhe.src.juc.future1;

/**
 *
 * @param <T>
 * @param <U>
 */
@FunctionalInterface
public interface BiConsumer<T, U> {

    void accept(T t, U u) throws Exception;

}