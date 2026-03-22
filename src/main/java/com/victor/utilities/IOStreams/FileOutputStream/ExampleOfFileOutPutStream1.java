package com.victor.utilities.IOStreams.FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleOfFileOutPutStream1 {
    public static void main(String[] args) {
        String text = "\nAppended text!";
        // true = append mode (keeps existing content)
        try (FileOutputStream output = new FileOutputStream("filename.txt", true)) {
            output.write(text.getBytes());
            System.out.println("Successfully append to file");
        } catch (IOException e) {
            System.out.println("Error writing file");
            e.printStackTrace();
        }
    }
}
