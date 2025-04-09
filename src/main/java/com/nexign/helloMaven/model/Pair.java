package com.nexign.helloMaven.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;


public class Pair<M, P> {
    private M car;
    private P driver;

    public Pair(M car, P driver) {
        this.car = car;
        this.driver = driver;
    }

    public M getCar() {
        return car;
    }

    public void setCar(M car) {
        this.car = car;
    }

    public P getDriver() {
        return driver;
    }

    public void setDriver(P driver) {
        this.driver = driver;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(car, pair.car) && Objects.equals(driver, pair.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car, driver);
    }
}
