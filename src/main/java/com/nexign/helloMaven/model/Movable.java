package com.nexign.helloMaven.model;

public interface Movable {
    void move();

    default SomeClass someMethod() {
        return new SomeClass(5);
    }

    class SomeClass {
        int a = 4;

        public SomeClass(int a) {
            this.a = a;
        }
    }
}
