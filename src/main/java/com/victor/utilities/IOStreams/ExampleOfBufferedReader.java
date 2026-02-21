package com.victor.utilities.IOStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExampleOfBufferedReader {
    public static void main(String[] args) {
        /* Same as below
        FileReader fr = new FileReader("filename.txt");
        BufferedReader br = new BufferedReader(fr); */
        try (BufferedReader br = new BufferedReader(new FileReader("filename.txt"))) {
            String line;
            /*
            BufferedReader.read() will do this after a line feed or a carriage return:
            "The position is set to the beginning of the next line."
            same as Scanner.nextLine(). But it's not fucking written in the document
             */
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
            // experiment
            e.printStackTrace();
        }


    }
}
