package com.implicit_autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComponentScan {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        House house = context.getBean(House.class);

//        house.action();

        house.getDog().sound();

    }
}
