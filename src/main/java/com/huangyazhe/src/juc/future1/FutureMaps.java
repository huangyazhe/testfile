package com.huangyazhe.src.juc.future1;


public final class FutureMaps {
    private FutureMaps(){
    }

    public static <K, V> FutureMap<K, V> newFutureMap() {
        return new FutureMap<>();
    }
}
