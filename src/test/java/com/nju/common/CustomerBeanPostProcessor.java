package com.nju.common;

import com.nju.bean.Car;
import com.nju.beans.BeansException;
import com.nju.beans.factory.config.BeanPostProcessor;

public class CustomerBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization");
        if ("car".equals(beanName)) {
            ((Car) bean).setBrand("wenjie");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization");
        return bean;
    }
}
