package com.nexign.helloMaven;

import com.google.gson.Gson;
import com.nexign.helloMaven.model.*;
import com.nexign.helloMaven.service.FunInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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

        Driver alexTheDriver = new Driver("Alex", 30, 'B');
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
        List<Car> blackCars = sortedCatalog.carFilter("2024");


//        Optional<Car> first = blackCars
//                .stream()
//                .filter(x -> x.getColor().equals("yellow"))
//                .findFirst();



//        System.out.println(first.get().getName());


        blackCars
                .stream()
                .map(x -> x.getColor())
                .filter(x-> x.equals("white"))
                .forEach(x -> System.out.println(x + "!"));

        System.out.println(blackCars);

        Map<Person, Car> pairs = new HashMap<>();
        pairs.put(stasTheManager, toyota);
        pairs.put(theManager, bmw);


        System.out.println(pairs.get(stasTheManager));
        System.out.println(pairs.get(stasTheManager).equals(pairs.get(theManager)));

        Pair<Movable, Person> pair1 = new Pair<>(helicopter, theManager);
        Pair<Integer, Person> pair2 = new Pair<>(1, theManager);
        Pair<Integer, HashMap<Integer, String>> pair3 = new Pair<>(1, new HashMap<>());

        Car car = new Car() {
            int a = 4;

            public void someMeth() {
                System.out.println(2);
            }
        };

//        alexTheDriver.drive(toyota);
        FunInterface f = car1 -> car1.getColor() + car1.getName();

        alexTheDriver.drive(toyota, f);


        String json = """
                {
                    "name": "Alex",
                    "age": 30
                }
                """;


        Gson gson = new Gson();

        String json1 = gson.toJson(toyota);

        System.out.println(json1);

        Person person = gson.fromJson(json, Person.class);
        System.out.println(person.getName());

    }
}
