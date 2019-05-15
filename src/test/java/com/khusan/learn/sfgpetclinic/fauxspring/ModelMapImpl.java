package com.khusan.learn.sfgpetclinic.fauxspring;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Khusen Sharipov
 * Date: 13/05/2019
 * Time: 15:53
 */
public class ModelMapImpl implements Model {
    Map<String, Object> objectMap = new HashMap<>();

    @Override
    public void addAttribute(String key, Object o) {
        objectMap.put(key, o);
    }

    @Override
    public void addAttribute(Object o) {

    }

    public Map<String, Object> getMap() {
        return objectMap;
    }
}
