/* Bounded types - Generic method */
package com.victor.utilities.Advanced.Generics.Experiment;

// NO class generic type parameter (belongs to object / instance)
class Stats {

    // Method-level generic type parameter (belongs to method itself)
    // T is determined at method call (type inference)
    static <T extends Number> double average(T[] array) {
        double sum = 0;
        for (T i : array) {
            sum += i.doubleValue();
        }
        return sum / array.length;
    }
}

public class ExampleOfGeneric3 {
    public static void main(String[] args) {
        Integer[] myInt = {10, 20, 30, 40};
        System.out.println(Stats.average(myInt));
    }
}
