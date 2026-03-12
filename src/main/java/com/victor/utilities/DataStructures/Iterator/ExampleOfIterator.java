package com.victor.utilities.DataStructures.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleOfIterator {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get an iterator for the ArrayList
        Iterator<String> it = cars.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
