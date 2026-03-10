package com.victor.utilities.Advanced.Annotations;

import java.util.ArrayList;

public class ExampleOfAnnotation3 {
    public static void main(String[] args){
        @SuppressWarnings("rawtypes")
        ArrayList cars= new ArrayList();
        cars.add("Volvo");
        System.out.println(cars);
    }
}
