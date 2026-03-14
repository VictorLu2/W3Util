package com.victor.utilities.DataStructures.Algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class ExampleOfAlgorithms6 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");

        int count = Collections.frequency(fruits, "Banana");
        System.out.println("Banana appears " + count + " times");

        Collections.swap(fruits, 0, 1);
        System.out.println(fruits);
    }
}
