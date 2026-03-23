package com.victor.utilities.Advanced.Lambda;

@FunctionalInterface
interface Consumer<T> {
    void accept(T t);
}

// Usual
class MyConsumer implements Consumer<Integer>{
    @Override
    public void accept(Integer t) {
        System.out.println(t);
    }
}