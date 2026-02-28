package com.victor.utilities.Tutorial.ForLoop;

public class ExampleOfForEachLoop {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
        /* Equals
        for(i = 0; i < cars.length ; i++){
        String i = cars[i];
        System.out.println(i);
        }
        */
    }
}
