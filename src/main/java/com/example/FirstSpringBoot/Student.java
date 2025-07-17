package com.example.FirstSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class Student
{
    int age;
    public void setAge(int age) {
        this.age = age;
    }
    
    public void show()
    {
        System.out.println("Hey World");
        System.out.println("Hii");
    }
}
