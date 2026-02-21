package com.victor.utilities.FileHandling.experiment;

import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
        File myObj = new File("DirectoryToDelete");
//        try catch is not required to handle Exception
            if (myObj.mkdir()) {
                System.out.println("Directory created: " + myObj.getAbsolutePath());
            } else {
                System.out.println("Directory already created");
            }
    }
}
