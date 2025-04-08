package com.nexign.helloMaven.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car implements Movable{
    private String name;
    private String color;
    private int year;

    @Override
    public void move() {
        System.out.println("Машина делает врррр");
    }

    //Alt + insert - generator


}


