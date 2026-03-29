package com.victor.utilities.Classes.Anonymous;

class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

public class ExampleOfAnonymous {
    public static void main(String[] args) {
        //  Anonymous class that overrides makeSound()
        Animal myAnimal = new Animal() {
            @Override
            void makeSound() {
                System.out.println("Woof woof");
            }
        };  //  semicolon is required to end the line of code that creates the object
        myAnimal.makeSound();
    }
}

/* Syntactic sugar
public class ExampleOfAnonymous {

    public static void main(String[] args) {

        // conceptual local class
        final class AnonymousClass extends Animal {

            AnonymousClass() {
                super();
            }

            @Override
            void makeSound() {
                System.out.println("Woof woof");
            }
        }

        Animal myAnimal = new AnonymousClass();

        myAnimal.makeSound();
    }
}
 */

