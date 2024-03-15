package com.nju;

import com.nju.beans.factory.config.BeanDefinition;
import com.nju.beans.factory.support.DefaultListableBeanFactory;
import com.nju.service.HelloService;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BeanContainerTest {

    @Test
    public void testGetBean() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
        beanFactory.registerBeanDefinition("helloService", beanDefinition);
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.sayHello();
    }
}
