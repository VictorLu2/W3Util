/* Generic method */
package com.victor.utilities.Advanced.Generics;

public class ExampleOfGeneric1 {
    static <T> void printArray(T[] array) {
        for (T i : array) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // int[] is a reference, but the elements inside are primitive
        // Generics can only accept the reference type: int[] -> Integer[]
        Integer[] myNumbers = {1, 2, 3};
        String[] myString = {"Ben", "Tom", "Victor"};

        printArray(myNumbers);
        printArray(myString);
    }
}
