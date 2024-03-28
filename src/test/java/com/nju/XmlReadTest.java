package com.nju;

import com.nju.bean.Car;
import com.nju.bean.Person;
import com.nju.beans.factory.support.DefaultListableBeanFactory;
import com.nju.beans.factory.xml.XmlBeanDefinitionReader;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class XmlReadTest {

    @Test
    public void testXmlFile() throws Exception {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions("classpath:spring.xml");

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);

        assertThat(person.getName()).isEqualTo("kevin");
        assertThat(person.getCar().getBrand()).isEqualTo("nio");

        Car car = (Car) beanFactory.getBean("car");
        System.out.println(car);
        assertThat(car.getBrand()).isEqualTo("nio");
    }
}
