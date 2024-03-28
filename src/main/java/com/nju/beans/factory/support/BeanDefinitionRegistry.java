package com.nju.beans.factory.support;

import com.nju.beans.factory.config.BeanDefinition;

/**
 * BeanDefinition注册接口
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 是否包含指定beanName的beanDefinition
     * @param beanName
     * @return 结果
     */
    boolean containsBeanDefinition(String beanName);
}
