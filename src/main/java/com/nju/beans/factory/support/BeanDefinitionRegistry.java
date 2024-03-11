package com.nju.beans.factory.support;

import com.nju.beans.factory.config.BeanDefinition;

/**
 * BeanDefinition注册接口
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
