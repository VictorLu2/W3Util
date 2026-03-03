/* Generic class */
package com.victor.utilities.Advanced.Generics;

// <T> is a type parameter, it changes when you new it
class Box<T> {
    T value;    // T is a placeholder for any type

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

public class ExampleOfGeneric {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();    // Diamond Operator
        stringBox.set("Hello");
        System.out.println("Value: " + stringBox.get());

        Box<Integer> integerBox = new Box<>();
        integerBox.set(50);
        System.out.println("Value: " + integerBox.get());
    }
}
