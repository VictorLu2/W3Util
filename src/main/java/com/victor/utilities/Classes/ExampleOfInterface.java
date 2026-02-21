package com.victor.utilities.Classes;

// Interface
interface Animal1 {
    // Methods in the interface will automatically be public
    public void animalsound();
    public void sleep();
}

//  Pig1 "implements" the Animal interface
class Pig1 implements Animal1 {
    // The body of animalsound() is provided here
    @Override
    public void animalsound() {
        System.out.println("The pig says: wee wee");
    }

    //  The body of sleep() is provided here
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Main1 {
    public static void main(String[] args) {
        Pig1 myPig = new Pig1();    // Create a Pig1 object
        myPig.animalsound();
        myPig.sleep();
    }
}