package com.nexign.helloMaven;

import com.nexign.helloMaven.model.*;

public class App {

    private static final String NEW_VALUE = "1";

    public static void main(String[] args) {

        Car toyota = new Car("Toyota", "white", 2001);
        String color = toyota.getColor();
        //ALT + ENTER
//        Person person = new Person("Alex", 23);
//        Person person1 = new Person("Alex", 23);
//        System.out.println(person1.getCount());
//        int age = person.age();
        String newValue = App.NEW_VALUE;


//        POJO - plain old java object

        Person alexTheDriver = new Driver("Alex", 30, 'B');
        Manager stasTheManager = new Manager("Stas", 45);
        alexTheDriver.drive();

        Pair pair = new Pair(toyota, stasTheManager);


    }
}
