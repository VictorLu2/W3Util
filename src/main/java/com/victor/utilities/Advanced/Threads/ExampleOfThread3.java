package com.victor.utilities.Advanced.Threads;

public class ExampleOfThread3 implements Runnable {
    public static void main(String[] args) {
        ExampleOfThread3 ref = new ExampleOfThread3();
        Thread thread = new Thread(ref);
        thread.start();
        System.out.println("This code is not running in thread");
    }

    @Override
    public void run() {
        System.out.println("This code is running in thread");
    }
}
