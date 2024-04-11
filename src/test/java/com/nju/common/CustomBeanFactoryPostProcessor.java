package com.nju.common;

import com.nju.beans.BeansException;
import com.nju.beans.PropertyValue;
import com.nju.beans.PropertyValues;
import com.nju.beans.factory.ConfigurableListableBeanFactory;
import com.nju.beans.factory.config.BeanDefinition;
import com.nju.beans.factory.config.BeanFactoryPostProcessor;

public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("person");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();
        // 将person的name改为melody
        propertyValues.addPropertyValue(new PropertyValue("name", "melody"));
    }
}
