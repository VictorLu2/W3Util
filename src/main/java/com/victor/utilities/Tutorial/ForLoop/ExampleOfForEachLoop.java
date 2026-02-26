package com.victor.utilities.Tutorial.ForLoop;

public class ExampleOfForEachLoop {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }
        /* Equals
        for(i = 0; i < cars.length ; i++){
        String car = cars[i];
        System.out.println(car);
        }
        */
    }
}
