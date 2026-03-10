package com.victor.utilities.DataStructures.LinkedHashSet;

import java.util.LinkedHashSet;

public class ExampleOfLinkedHashSet {
    public static void main(String[] args){
        LinkedHashSet<String> cars = new LinkedHashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");    // Duplicate
        cars.add("Mazda");

        System.out.println(cars);   //  remembers the order
    }
}
