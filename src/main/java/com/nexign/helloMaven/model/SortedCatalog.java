package com.nexign.helloMaven.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortedCatalog implements Sortable{
    private List<Car> carList = List.of(
            new Car("toyota", "white", 2001),
            new Car("nissan", "grey", 2001),
            new Car("geely", "black", 2024)
    );

    public List<Car> getCarList() {
        return carList;
    }

    @Override
    public List<Car> carSort() {
        return List.of();
    }

    public List<Car> carFilter(String filter) {
        List<Car> tempList = new ArrayList<>();
        for (Car car : carList) {
            if (Integer.toString(car.getYear()).equals(filter) ||
                                  car.getName().equals(filter) ||
                                  car.getColor().equals(filter)) {
                tempList.add(car);
            }
        }
        if (tempList.isEmpty()) {
            throw new RuntimeException("Нет таких элементов");
        }
        return tempList.size() == 1 ? Collections.singletonList(tempList.getFirst()) : tempList;
    }
}
