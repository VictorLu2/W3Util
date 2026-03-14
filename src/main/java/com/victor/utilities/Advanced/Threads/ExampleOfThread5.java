/* Avoiding concurrency problems */
package com.victor.utilities.Advanced.Threads;

public class ExampleOfThread5 extends Thread {
    static int number = 0;

    public static void main(String[] args) {
        ExampleOfThread5 ref = new ExampleOfThread5();
        ref.start();
        while (ref.isAlive()) {     //  check whether the thread has finished running
            System.out.println("waiting...");
        }
        System.out.println(number);
        number++;
        System.out.println(number);
    }

    @Override
    public void run() {
        number++;
    }
}
