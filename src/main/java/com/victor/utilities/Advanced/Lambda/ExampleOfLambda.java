package com.victor.utilities.Advanced.Lambda;

import java.util.ArrayList;
import java.util.List;

public class ExampleOfLambda {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        numbers.forEach((n) -> {
            System.out.println(n);
        });
    }
}
/*
        forEach(Consumer < ? super E > action) {...}

        Lambda condition:
            Target type must be a Functional Interface (interface with exactly one abstract method).
            Lambda cannot target a normal class.
        public interface Consumer<T> {
            void accept(T t);
        }

        Usual:
        class MyConsumer implements Consumer<Integer> {
            @Override
            public void accept(Integer n) {
                System.out.println(n);
            }
        }
        Consumer<Integer> c = new MyConsumer();

        Anonymous class:
        Consumer<Integer> c = new Consumer<>() {
            @Override
            public void accept(Integer n) {
                System.out.println(n);
            }
        } ;

        Lambda:
        Consumer<Integer> c = (Integer n) -> {
            System.out.println(n);
        };

        simplify:
        Consumer<Integer> c = n -> System.out.println(n);

        simplify:
        numbers.forEach(n -> System.out.println(n));
 */
