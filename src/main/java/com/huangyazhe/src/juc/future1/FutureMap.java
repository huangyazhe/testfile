package com.huangyazhe.src.juc.future1;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 支持Lambda抛出异常
 */
public class FutureMap<K,V> {

    private Map<K, V> map;

    public FutureMap() {
        map = new HashMap<>();
    }

    public void forEach(BiConsumer<? super K, ? super V> action) throws Exception {
        Objects.requireNonNull(action);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K k;
            V v;
            try {
                k = entry.getKey();
                v = entry.getValue();
            } catch(IllegalStateException ise) {
                throw new ConcurrentModificationException(ise);
            }
            action.accept(k, v);
        }
    }

    public V put(K key, V value) {
        return map.put(key, value);
    }

}
