package com.nju.beans.factory.config;

/**
 * 单例bean注册接口
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
