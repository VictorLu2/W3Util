package com.victor.utilities.DataStructures.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleOfIterator2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (next < 10) {
                it.remove();
            }
        }
        System.out.println(numbers);

//        Changing size in for loop or a for-each loop would not work correctly
//        for (Integer i : numbers) {
//            if (i < 10) {
//                numbers.remove(i);
//            }
//    }
//        System.out.println(numbers);
    }
}
