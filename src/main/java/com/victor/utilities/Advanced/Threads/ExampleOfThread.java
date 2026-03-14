package com.victor.utilities.Advanced.Threads;

public class ExampleOfThread extends Thread{
    @Override
    public void run(){  //  if thread is created, run this
        System.out.println("This code is running in a thread");
    }
}
