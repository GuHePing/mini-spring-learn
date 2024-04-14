package com.nju.context.support;

import com.nju.beans.BeansException;

public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext {
    private String[] configLocations;

    /**
     * 从xml文件加载BeanDefinition，并自动刷新上下文
     *
     * @param configLocations
     * @throws BeansException
     */
    public ClassPathXmlApplicationContext(String[] configLocations) throws BeansException {
        this.configLocations = configLocations;
        refresh();
    }

    public ClassPathXmlApplicationContext(String configLocation) throws BeansException {
        this(new String[] {configLocation});
    }

    @Override
    protected String[] getConfigLocations() {
        return this.configLocations;
    }
}
