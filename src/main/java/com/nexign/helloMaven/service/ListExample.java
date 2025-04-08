package com.nexign.helloMaven.service;

import com.nexign.helloMaven.model.Car;
import com.nexign.helloMaven.model.Person;

import java.util.*;

public class ListExample {

    public List<Integer> exampleListMethod(int... i) {

        List<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> integers2 = new ArrayList<>(List.of(1,2,3));

        for (int num : i) {
            integers.add(num);
        }
        Integer[] array = integers.toArray(new Integer[0]);
        LinkedList<String> ll = new LinkedList<>();
//        ll.removeFirst("One");
//        ll.pollFirst("Two");
        return null;
    }

    public static void main(String[] args) {
        ListExample listExample = new ListExample();
        listExample.exampleListMethod(1,2,3,4);


    }

}
