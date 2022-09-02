package com.rdlabs.spring_dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Vehicle obj = (Vehicle) context.getBean("vehicle");
        obj.drive();

        Vehicle obj1 = (Vehicle) context.getBean("car");
        obj1.drive();


    }
}
