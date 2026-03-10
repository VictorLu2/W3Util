/* @Deprecated */
package com.victor.utilities.Advanced.Annotations;

public class ExampleOfAnnotation2 {
    @Deprecated
    void oldMethod(){
        System.out.println("This method is outdated");
    }
    public static void main(String[] args){
        ExampleOfAnnotation2 myAnn = new ExampleOfAnnotation2();
        myAnn.oldMethod();  // Most IDEs or compilers will show a warning
    }
}
