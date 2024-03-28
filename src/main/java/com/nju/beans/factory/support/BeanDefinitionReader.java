package com.nju.beans.factory.support;

import com.nju.beans.BeansException;
import com.nju.cores.io.Resource;
import com.nju.cores.io.ResourceLoader;

/**
 * 读取BeanDefinition的接口
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String[] locations) throws BeansException;
}
