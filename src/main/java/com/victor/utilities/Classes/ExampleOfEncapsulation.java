package com.victor.utilities.Classes;

// This would normally be public class
class Person {
    private String name;    // private = restricted class

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}

public class ExampleOfEncapsulation {
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setName("Victor");    // set the name variable to "Victor"
        System.out.println(myObj.getName());
    }
}
