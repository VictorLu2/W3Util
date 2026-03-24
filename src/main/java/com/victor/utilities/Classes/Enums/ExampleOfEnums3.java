package com.victor.utilities.Classes.Enums;

enum Level1 {
    LOW,
    MEDIUM,
    HIGH
}

public class ExampleOfEnums3 {
    public static void main(String[] args) {
        for (Level1 i : Level1.values()) {
            System.out.println(i);
        }
    }
}
