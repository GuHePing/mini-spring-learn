package com.nju;

import com.nju.bean.Car;
import com.nju.bean.Person;
import com.nju.beans.factory.support.DefaultListableBeanFactory;
import com.nju.beans.factory.xml.XmlBeanDefinitionReader;
import com.nju.common.CustomBeanFactoryPostProcessor;
import static org.assertj.core.api.Assertions.assertThat;

import com.nju.common.CustomerBeanPostProcessor;
import org.junit.Test;

public class BeanFactoryPostProcessorAndBeanPostProcessorTest {

    @Test
    public void testBeanFactoryPostProcessor() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions("classpath:spring.xml");

        // 在beanDefinition加载完成后，bean实例化前修改beanDefinition的属性
        CustomBeanFactoryPostProcessor beanFactoryPostProcessor = new CustomBeanFactoryPostProcessor();
        beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);

        assertThat(person.getName()).isEqualTo("melody");
    }

    @Test
    public void testBeanPostProcessor() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions("classpath:spring.xml");

        // 在bean实例化后修改bean的属性
        CustomerBeanPostProcessor beanPostProcessor = new CustomerBeanPostProcessor();
        beanFactory.addBeanPostProcessor(beanPostProcessor);

        Car car = (Car) beanFactory.getBean("car");
        System.out.println(car);

        assertThat(car.getBrand()).isEqualTo("wenjie");
    }
}
