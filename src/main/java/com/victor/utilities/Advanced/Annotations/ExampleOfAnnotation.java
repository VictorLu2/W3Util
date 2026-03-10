/* @Override */
package com.victor.utilities.Advanced.Annotations;

class Animal {
    void makesound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makesound() {
        System.out.println("Woof!");
    }

}
