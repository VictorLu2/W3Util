package com.victor.utilities.DataStructures;

import java.util.HashSet;

public class ExampleOfHashset {
    public static void main(String[] args){
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");    //  Duplicate set element
        cars.add("Mazda");
        System.out.println(cars);
    }
}
