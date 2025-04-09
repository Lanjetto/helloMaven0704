package com.nexign.helloMaven.model;

import com.nexign.helloMaven.service.FunInterface;

public class Driver extends Person{
    private Category category;

    public Driver(String name, int age, Character category) {
        super(name, age);
        this.category = switch (category) {
            case 'A' -> Category.A;
            case 'B' -> Category.B;
            case 'C' -> Category.C;
            case 'D' -> Category.D;
            default -> Category.B;
        };
    }
    private enum Category {
        A, B, C, D
    }

    @Override
    public void drive() {
        System.out.println("Профессионально водит");
    }

    public void drive(Car car) {
        System.out.println(car.getName());
    }

    public void drive(Car car, FunInterface f) {
        System.out.println(f.fun(car));
    }

}
