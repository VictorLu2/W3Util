package com.victor.utilities.Advanced.WrapperClass;

public class ExampleOfWrapper {
    public static void main(String[] args){
        // The following are local variables
        // Wrapper classes are objects, not primitives

        // Autoboxing (syntactic sugar) -> Integer myInt = Integer.valueOf(5);
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
    }

}
