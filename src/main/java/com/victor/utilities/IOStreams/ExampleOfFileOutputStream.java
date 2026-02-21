package com.victor.utilities.IOStreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleOfFileOutputStream {
    public static void main(String[] args) {
        // The text we want to write
        String text = "Hello Word";
        // try-with-resources: stream will be closed automatically
        try (FileOutputStream output = new FileOutputStream("Filename.txt")) {
            output.write(text.getBytes());  // convert text to bytes and write
            System.out.println("Successfully wrote to file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
            e.printStackTrace();
        }

    }


}
