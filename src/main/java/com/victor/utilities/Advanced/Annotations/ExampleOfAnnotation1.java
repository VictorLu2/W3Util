/* @Override */
package com.victor.utilities.Advanced.Annotations;

class Animal1 {
    void makesound(){
    System.out.println("Animal sound");
    }
}

class Dog1 extends Animal1{
//    @Override
    void makesoun(){    // Typo here
        System.out.println("Bark!");
    }
}

public class ExampleOfAnnotation1 {
    public static void main(String[] args){
    Dog1 myDog = new Dog1();
    myDog.makesoun();
    }
}