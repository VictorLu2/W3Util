package com.victor.utilities.DataStructures.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleOfIterator1 {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Iterator<String> it = cars.iterator();
        System.out.println(it.next());

//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
    }
}
