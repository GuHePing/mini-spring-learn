package com.nju.beans.factory;

import com.nju.beans.BeansException;
import com.nju.beans.factory.config.AutowireCapableBeanFactory;
import com.nju.beans.factory.config.BeanDefinition;
import com.nju.beans.factory.config.BeanPostProcessor;
import com.nju.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    /**
     * 根据名称查找BeanDefinition
     *
     * @param beanName
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 提前实例化所有单例实例
     *
     * @throws BeansException
     */
    void preInstantiateSingletons() throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
