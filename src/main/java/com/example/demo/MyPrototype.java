package com.example.demo;

public class MyPrototype {
    private static MyPrototype INSTANCE = new MyPrototype();

    private MyPrototype() {

    }

    public static MyPrototype getInstance() {
        try {
            return (MyPrototype) INSTANCE.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
