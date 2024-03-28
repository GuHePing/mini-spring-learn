package com.nju.beans.factory.support;

import com.nju.beans.BeansException;
import com.nju.beans.factory.config.BeanDefinition;

/**
 * Bean实例化策略
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
