package com.implicit_autowiring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Cat implements Drivable {
    @Override
    public void sound() {
        System.out.println("Cat");
    }
}
