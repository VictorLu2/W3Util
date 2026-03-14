package com.victor.utilities.Advanced.Threads;

public class ExampleOfThread2 extends Thread{
    public static void main(String[] args) {
        ExampleOfThread2 thread = new ExampleOfThread2();
        thread.start(); //  Thread created
        System.out.println("This code is outside of the thread");
    }

    @Override
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
