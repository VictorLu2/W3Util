package com.victor.utilities.Classes.Abstraction;

// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalsound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

//  Subclass (inherit from Animal)
class Pig extends Animal {
     public void animalsound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();  // Create a Pig object
        myPig.animalsound();
        myPig.sleep();
    }
}