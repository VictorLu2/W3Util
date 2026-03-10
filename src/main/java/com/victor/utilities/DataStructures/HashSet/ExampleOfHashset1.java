package com.victor.utilities.DataStructures.HashSet;

import java.util.HashSet;

public class ExampleOfHashset1 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        for (int i = 0; i <= 10; i++) {
            // Auto boxing -> numbers.contains(Integer.valueOf(i));
            if (numbers.contains(i)) {
                System.out.println(i + " Was found in the set");
            } else {
                System.out.println(i + " Was not found in the set");
            }
        }
    }
}
