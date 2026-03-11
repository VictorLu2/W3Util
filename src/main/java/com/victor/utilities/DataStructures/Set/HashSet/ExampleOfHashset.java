package com.victor.utilities.DataStructures.Set.HashSet;

import java.util.HashSet;

public class ExampleOfHashset {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");    //  Duplicate set element (Ignored)
        cars.add("Mazda");
        System.out.println(cars);

//        System.out.println(cars.contains("Volvo"));   // String is an Object

//        cars.remove("Volvo");
//        System.out.println(cars);

//        cars.clear();
//        System.out.println(cars);

//        System.out.println(cars.size());

//        for (String i : cars){
//            System.out.println(i);
//        }
    }
}
