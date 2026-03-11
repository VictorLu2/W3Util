package com.victor.utilities.DataStructures.Set.TreeSet;

import java.util.TreeSet;

public class ExampleOfTreeSet {
    public static void main(String[] args) {
        TreeSet<String> cars = new TreeSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");    // Duplicate
        cars.add("Mazda");
        System.out.println(cars);   //  Sorted order

//        System.out.println(cars.contains("Volvo"));

//        cars.remove("Volvo");
//        System.out.println(cars);

//        cars.clear();
//        System.out.println(cars);

//        System.out.println(cars.size());

//        for (String i : cars) {
//            System.out.println(i);
//        }
    }
}
