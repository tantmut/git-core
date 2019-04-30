package com.implicit_autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class House {

    /*@Autowired
    private ReaderService service;

    public void action() {
        service.action();
    }*/

    @Autowired
    @Qualifier("lion")
    private Drivable drivable;

    public Drivable getDog() {
        return drivable;
    }
}
