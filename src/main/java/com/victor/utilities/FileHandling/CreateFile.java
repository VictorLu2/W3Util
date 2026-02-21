package com.victor.utilities.FileHandling;
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] arg) {
        try {
            File myObj = new File("DirectoryToDelete/DeleteThisFile.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
                System.out.println("directory now: " + System.getProperty("user.dir"));
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
