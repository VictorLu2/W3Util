package com.victor.utilities.Classes.InnerClasses;

class OuterClass1 {
    int x = 10;

    private class InnerClass {  // InnerClass can be private or protected
        int y = 5;
    }
}

public class ExampleOfInnerClass1 {
    public static void main(String[] args) {
        OuterClass1 myOuter = new OuterClass1();
        /*
        Can't access due to private Inner Class
        OuterClass1.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myOuter.x + myInner.y);
        */

    }
}
