package com.victor.utilities.DataStructures.ArrayList;

import java.util.ArrayList;

public class ExampleOfArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        cars.add(0, "Mazda");   // Insert element at the beginning of the list (0)
        System.out.println(cars);
    }
}
