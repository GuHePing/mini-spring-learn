package com.nju;

import com.nju.bean.Car;
import com.nju.bean.Person;
import com.nju.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationContextTest {

    @Test
    public void test() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");

        Car car = applicationContext.getBean("car", Car.class);
        System.out.println(car);
        assertThat(car.getBrand()).isEqualTo("wenjie");

        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
        assertThat(person.getName()).isEqualTo("melody");
    }
}
