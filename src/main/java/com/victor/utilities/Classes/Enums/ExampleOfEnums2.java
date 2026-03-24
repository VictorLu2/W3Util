package com.victor.utilities.Classes.Enums;

enum Level{
    LOW,
    MEDIUM,
    HIGH
}

public class ExampleOfEnums2 {
    public static void main(String[] args) {
        Level myRef = Level.HIGH;
     switch (myRef) {
         case LOW:
              System.out.println("Low Level");
              break;
         case MEDIUM:
             System.out.println("Medium Level");
             break;
         case HIGH:
             System.out.println("High Level");
             break;
     }
    }
}

