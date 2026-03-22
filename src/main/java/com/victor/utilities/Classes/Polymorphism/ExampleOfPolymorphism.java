package com.victor.utilities.Classes.Polymorphism;

class Animal2{
    public void makesound(){
        System.out.println("The animal makes a sound");
    }
}

class Pig2 extends Animal2{
    public void makesound(){
    System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal2{
    public void makesound(){
        System.out.println("The Dog says: bow wow");
    }
}

class ExampleOfPolymorphism {
    public static void main(String[] args){
        Animal2 myAnimal = new Animal2();
        Animal2 myPig = new Pig2();
        Animal2 myDog = new Dog();
        myAnimal.makesound();
        myPig.makesound();
        myDog.makesound();
    }
}
