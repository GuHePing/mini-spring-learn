package com.nju;

import com.nju.bean.Car;
import com.nju.bean.Person;
import com.nju.beans.PropertyValue;
import com.nju.beans.PropertyValues;
import com.nju.beans.factory.config.BeanDefinition;
import com.nju.beans.factory.config.BeanReference;
import com.nju.beans.factory.support.DefaultListableBeanFactory;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class PopulateBeanWithPropertyValuesTest {

    @Test
    public void testPopulateBeanWithPropertyValuesTest() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("name", "kevin"));
        propertyValues.addPropertyValue(new PropertyValue("age", 25));
        BeanDefinition beanDefinition = new BeanDefinition(Person.class, propertyValues);

        beanFactory.registerBeanDefinition("person", beanDefinition);
        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
        assertThat(person.getName()).isEqualTo("kevin");
        assertThat(person.getAge()).isEqualTo(25);
    }

    @Test
    public void testPopulateBeanWithBean() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // Car属性
        PropertyValues carPropertyValues = new PropertyValues();
        carPropertyValues.addPropertyValue(new PropertyValue("brand", "nio"));
        BeanDefinition carBeanDefinition = new BeanDefinition(Car.class, carPropertyValues);
        beanFactory.registerBeanDefinition("car", carBeanDefinition);
        // Person属性
        PropertyValues personPropertyValues = new PropertyValues();
        personPropertyValues.addPropertyValue(new PropertyValue("name", "kevin"));
        personPropertyValues.addPropertyValue(new PropertyValue("age", 25));
        personPropertyValues.addPropertyValue(new PropertyValue("car", new BeanReference("car")));
        BeanDefinition personBeanDefinition = new BeanDefinition(Person.class, personPropertyValues);
        beanFactory.registerBeanDefinition("person", personBeanDefinition);

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
        assertThat(person.getCar()).isNotNull();
        assertThat(person.getCar().getBrand()).isEqualTo("nio");
    }
}
