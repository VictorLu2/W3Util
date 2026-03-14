/* Concurrency problems */
package com.victor.utilities.Advanced.Threads;

public class ExampleOfThread4 extends Thread{
    static int number = 0;

    public static void main(String[] args) {
        ExampleOfThread4 ref = new ExampleOfThread4();
        ref.start();    //  Thread is made
        System.out.println(number);
        number++;
        System.out.println(number);
    }
    public void run() {
        number++;
    }
}
