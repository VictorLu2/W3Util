package com.victor.utilities.Classes.Enums;

public class ExampleOfEnums1 {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myRef = Level.MEDIUM;
        System.out.println(myRef);
    }
}
