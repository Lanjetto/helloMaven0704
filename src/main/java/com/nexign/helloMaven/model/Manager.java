package com.nexign.helloMaven.model;

public class Manager extends Person {
    public Manager(String name, int age) {
        super(name, age);
    }



    @Override
    public void drive() {
        System.out.println("НЕ ВОДИТ ВООБЩЕ");
    }
}
