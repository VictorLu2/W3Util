package com.victor.utilities.Classes.Anonymous;

interface Greeting {
    void hello();
}

public class ExampleOfAnonymous1 {
    public static void main(String[] args) {
        //  Anonymous class that implements Greeting
        Greeting myGreeting = new Greeting() {
            @Override
            public void hello() {
                System.out.println("Hello");
            }
        };
        myGreeting.hello();
    }
}

/* Syntactic sugar
public class ExampleOfAnonymous1 {

    public static void main(String[] args) {

        final class AnonymousClass implements Greeting {    // extends Object
        AnonymousClass() {
        super();    // Object()
        }

            @Override
            public void hello() {
                System.out.println("Hello");
            }
        }

        Greeting myGreeting = new AnonymousClass();

        myGreeting.hello();
    }
}
*/
