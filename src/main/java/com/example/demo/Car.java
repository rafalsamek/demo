package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private final Engine engine;

    @Autowired // to samo co bez - domyślnie konstruktor jest autowired
    public Car(Engine engine) {
        this.engine = engine;
    }

//    @Autowired
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }
}
