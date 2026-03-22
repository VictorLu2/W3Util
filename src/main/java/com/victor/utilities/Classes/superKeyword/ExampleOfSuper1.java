package com.victor.utilities.Classes.superKeyword;

class Animal4{
    String type = "Animal";
}

class Dog2 extends Animal4{
    String type = "Dog";    //  field hiding - Declaring the same field name as parent class
    void printType(){
        System.out.println(super.type);
    }
}

public class ExampleOfSuper1 {
    public static void main(String[] args){
        Dog2 myDog = new Dog2();
        myDog.printType();
    }
}
