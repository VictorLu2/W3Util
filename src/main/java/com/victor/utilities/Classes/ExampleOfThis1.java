package com.victor.utilities.Classes;

public class ExampleOfThis1 {
    int modelYear;
    String modelName;

    ExampleOfThis1(String modelName) {
        // Constructor chaining
        this(2000, modelName);
    }

    ExampleOfThis1(int modelYear, String modelName) {
        // Use 'this' to assign values to the class variables
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    void printInfo() {
        System.out.println(modelYear + " " + modelName);
    }

    public static void main(String[] args) {
        // Create a car with only modelName (uses default year)
        ExampleOfThis1 car1 = new ExampleOfThis1("Mustang");
        // Create a car with both model year and name
        ExampleOfThis1 car2 = new ExampleOfThis1(2020, "Future");
        car1.printInfo();
        car2.printInfo();
    }
}
