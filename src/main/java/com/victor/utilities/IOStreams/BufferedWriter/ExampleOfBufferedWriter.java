package com.victor.utilities.IOStreams.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleOfBufferedWriter {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("filename.txt"))) {
            bw.write("first line");
            // bw.write("first line\n");    This would also work
            bw.newLine();   //add line break
            bw.write("Second line");
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("error writing file");
            e.printStackTrace();
        }
    }
}
