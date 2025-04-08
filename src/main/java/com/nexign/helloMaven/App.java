package com.nexign.helloMaven;

import com.nexign.helloMaven.model.*;

import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    private static final String NEW_VALUE = "1";

    public static void main(String[] args) {

        Car toyota = new Car("Toyota", "white", 2001);
        Car bmw = new Car("BMW", "white", 2014);
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
        Manager theManager = new Manager("Stas", 45);
        alexTheDriver.drive();

        Pair pair = new Pair(toyota, stasTheManager);
        Helicopter helicopter = new Helicopter();

        Movable.SomeClass someClass = helicopter.someMethod();

        List<Movable> movables = List.of(toyota, helicopter);

        for (Movable movable : movables) {
            movable.move();
        }

        SortedCatalog sortedCatalog = new SortedCatalog();
        List<Car> whiteCars = sortedCatalog.carFilter("2001");
        System.out.println(whiteCars);

        Map<Person, Car> pairs = new HashMap<>();
        pairs.put(stasTheManager, toyota);
        pairs.put(theManager, bmw);


        System.out.println(pairs.get(stasTheManager));
        System.out.println(pairs.get(stasTheManager).equals(pairs.get(theManager)));

        Pair<Movable, Person> pair1 = new Pair<>(helicopter, theManager);
        Pair<Integer, Person> pair2 = new Pair<>(1, theManager);
        Pair<Integer, HashMap<Integer, String>> pair3 = new Pair<>(1, new HashMap<>());

    }
}
