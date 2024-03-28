package com.nju.beans.factory;

import com.nju.beans.BeansException;

public interface BeanFactory {

    /**
     * 获取bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object getBean(String beanName) throws BeansException;
}
