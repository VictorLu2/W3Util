package com.victor.utilities.DataStructures.ArrayList;

import java.util.ArrayList;

public class ExampleOfArrayList {
    public static void main(String[] args){
        ArrayList<String> cars =new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Benz");
        cars.add("Mazda");
        System.out.println(cars);
        /*  experiment
        String get = cars.get(1);
        System.out.println(get);
        */
    }
}
