/* Bounded types - Generic Class*/
package com.victor.utilities.Advanced.Generics;

class Stats<T extends Number> {
    T[] array;

    Stats(T[] array) {
        this.array = array;
    }

    double average() {
        double sum = 0;
        for (T i : array) {
            // The left side of += must be variable
            // Operator '+' cannot be applied to 'double', 'T'
            // Even though T is the subclass of Number, but + cannot be applied to the reference type
            sum += i.doubleValue();
        }
        return sum / array.length;
    }
}


public class ExampleOfGeneric2 {
    public static void main(String[] args) {
        Integer[] intNums = {10, 20, 30, 40};
        Stats<Integer> intStats = new Stats<>(intNums);
        System.out.println(intStats.average());

        Double[] doubleNums = {1.5, 2.5, 3.5};
        Stats<Double> doubleStats = new Stats<>(doubleNums);
        System.out.println(doubleStats.average());
    }

}
