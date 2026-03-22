package com.victor.utilities.Classes.InnerClasses;

class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}

public class ExampleOfInnerClass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myOuter.x + myInner.y);
    }

}
