package com.victor.utilities.Classes;

class OuterClass2 {
    int x = 10;

    static class InnerClass {
        int y = 5;
        void print(){
//            System.out.println(x);    static 區域不能直接存取非 static 成員
        }
    }
}

public class ExampleOfInnerClass2 {
    public static void main(String[] args) {
        OuterClass2.InnerClass myInner = new OuterClass2.InnerClass();
        System.out.println(myInner.y);
    }
}
