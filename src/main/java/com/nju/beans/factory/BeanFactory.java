package com.nju.beans.factory;

import com.nju.BeansException;

import java.util.HashMap;
import java.util.Map;

public interface BeanFactory {

    /**
     * 获取bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object getBean(String beanName) throws BeansException;
}
