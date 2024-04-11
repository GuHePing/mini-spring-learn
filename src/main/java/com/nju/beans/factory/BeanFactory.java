package com.nju.beans.factory;

import com.nju.beans.BeansException;

public interface BeanFactory {

    /**
     * 根据名称获取bean
     * @param beanName bean名称
     * @return bean
     * @throws BeansException
     */
    Object getBean(String beanName) throws BeansException;

    /**
     * 根据名称和类型获取bean
     * @param beanName bean名称
     * @param requiredType 指定的类型
     * @return
     * @param <T>
     * @throws BeansException
     */
    <T> T getBean(String beanName, Class<T> requiredType) throws BeansException;
}
