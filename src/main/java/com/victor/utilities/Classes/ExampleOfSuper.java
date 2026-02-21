package com.victor.utilities.Classes;

class Animal3{
    void makesound(){
        System.out.println("This animal makes a sound");
    }
}

class Dog1 extends Animal3{
    @Override
    void makesound(){
        super.makesound();  // call the parent method
        System.out.println("The dos says: bow wow");
    }
}

public class ExampleOfSuper {
    public static void main(String[] args){
        Dog1 myDog = new Dog1();
        myDog.makesound();
    }
}
