package com.victor.utilities.Classes;

class OuterClass3 {
    int x = 10;

    class InnerClass {
        int myInnerMethod() {
            return x;
        }
    }
}

public class ExampleOfInnerClass3 {
    public static void main(String[] args) {
    OuterClass3 myOuter = new OuterClass3();
    OuterClass3.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.myInnerMethod());
    }
}
