package com.victor.utilities.Classes.Interface;

interface Animal {
    int x = 10;

    void run();
}

/*
Syntactic sugar(Conceptual model)

public abstract class Animal {
    public static final int x = 10;

    public abstract void run();
}
*/