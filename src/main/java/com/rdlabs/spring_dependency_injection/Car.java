package com.rdlabs.spring_dependency_injection;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle
{
    public void drive()
    {
        System.out.println("Car is running");
    }

}
