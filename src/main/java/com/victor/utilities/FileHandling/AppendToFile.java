package com.victor.utilities.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args){
        try(FileWriter myWriter = new FileWriter("filename.txt", true)){
            myWriter.write("\nAppended text");
            System.out.println("Successfully append to file!");
        } catch(IOException e){
            System.out.println("Something Went Wrong");
            e.printStackTrace();

        }

    }
}
