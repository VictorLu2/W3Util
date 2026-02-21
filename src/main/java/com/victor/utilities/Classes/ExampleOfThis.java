package com.victor.utilities.Classes;

class Main3 {
    int x;  // class variable/ attribute/ field

    // Constructor with one parameter x
    //  shadowing - local variable "hides" instance field
    Main3(int x) {
        this.x = x; //  Refers to the class variable x
    }
}

public class ExampleOfThis {
    public static void main(String[] args) {
        // Create an object of Main and pass value 5 to the constructor
        Main3 myObj = new Main3(5);
        System.out.println("Value of x = " + myObj.x);
    }
}
