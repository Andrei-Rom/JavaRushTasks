package com.javarush.task.task34.task3413;

import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SoftCache {
    private Map<Long, SoftReference<AnyObject>> cacheMap = new ConcurrentHashMap<>();

    public AnyObject get(Long key) {
        SoftReference<AnyObject> softReference = cacheMap.get(key);
        //напишите тут ваш код
        return cacheMap.containsKey(key) ? softReference.get() : null;
    }

    public AnyObject put(Long key, AnyObject value) {
        SoftReference<AnyObject> softReference = cacheMap.put(key, new SoftReference<>(value));
        //напишите тут ваш код
        if (softReference != null) {
            AnyObject result = softReference.get();
            softReference.clear();
            return result;
        }
        return null;
    }

    public AnyObject remove(Long key) {
        SoftReference<AnyObject> softReference = cacheMap.remove(key);
        //напишите тут ваш код
        if (softReference != null) {
            AnyObject result = softReference.get();
            softReference.clear();
            return result;
        }
        return null;
    }
}