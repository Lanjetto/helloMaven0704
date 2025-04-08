package com.nexign.helloMaven.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pair {
    private Car car;
    private Person driver;
}
