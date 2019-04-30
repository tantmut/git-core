package com.implicit_autowiring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("lion")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Dog implements Drivable {
    private String name = "Jack";

    @Override
    public void sound() {
        System.out.println(name);
    }
}
