package com.nexign.helloMaven.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String name;
    private String color;
    private int year;

    //Alt + insert - generator


}


