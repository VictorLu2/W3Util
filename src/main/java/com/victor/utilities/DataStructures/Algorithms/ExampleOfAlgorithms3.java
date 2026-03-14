package com.victor.utilities.DataStructures.Algorithms;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleOfAlgorithms3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        for (String i : colors) {   //  Iterating (looping) through elements is another common algorithm
            System.out.println(i);
        }

//        Iterator<String> it = colors.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
    }
}
