package com.victor.utilities.DataStructures.Algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class ExampleOfAlgorithms {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Liam");
        names.add("Jenny");
        names.add("Kasper");
        names.add("Angie");

        Collections.sort(names);    //  Must be sorted first
        int index = Collections.binarySearch(names, "Angie");
        System.out.println("Angie is at index: " + index);
    }
}
