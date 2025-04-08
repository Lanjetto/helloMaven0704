package com.nexign.helloMaven.model;


import lombok.Data;

@Data
public abstract class Person {
    private final String name;
    private final int age;
    private static int count;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }
    public abstract void drive();

}
