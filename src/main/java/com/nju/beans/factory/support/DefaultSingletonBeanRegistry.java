package com.nju.beans.factory.support;

import com.nju.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return null;
    }

    public void addSingleton(String beanName, Object object) {
        singletonObjects.put(beanName, object);
    }
}
