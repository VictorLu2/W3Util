package com.victor.utilities.DataStructures;

import java.util.ArrayList;

public class ExampleOfArrayList4 {
    public static void main(String[] args) {
        // You can only put objects in Generic class
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);

        for (int n : myNumbers) {
            System.out.println(n);
        }
    }

}
