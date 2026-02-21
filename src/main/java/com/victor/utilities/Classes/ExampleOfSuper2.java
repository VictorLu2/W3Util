package com.victor.utilities.Classes;

class Animal5 {
    Animal5() {
        System.out.println("Animal is created");
    }
}

class Dog3 extends Animal5 {
    Dog3() {
        super();    // Call the parent constructor
        System.out.println("Dog is created");
    }
}

public class ExampleOfSuper2 {
    public static void main(String[] args) {
        Dog3 myDog = new Dog3();
    }
}
