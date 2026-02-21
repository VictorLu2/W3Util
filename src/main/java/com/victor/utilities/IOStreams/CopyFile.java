package com.victor.utilities.IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        // copy WatermelonCat.jpeg into copy.jpeg
        try (FileInputStream input = new FileInputStream("WaterMelonCat.jpeg");
             FileOutputStream output = new FileOutputStream("copy.jpeg")) {
            int i;
            while ((i = input.read()) != -1) {
                output.write(i);    // writes the raw byte to the new file
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error handling file.");
            // experiment
            e.printStackTrace();
        }
    }
}
