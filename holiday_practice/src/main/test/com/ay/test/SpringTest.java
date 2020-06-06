package com.ay.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class SpringTest {

    @Test
    public void testSpring() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取SpringTest类
        SpringTest springTest = (SpringTest) applicationContext.getBean("springTest");
        //调用sayHello类
        springTest.sayHello();
    }

    public void sayHello() {

        System.out.println("hello ay");
    }
}
