package com.victor.utilities.FileHandling.ReadFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args){
        File myFile = new File("filename.txt");
        try(Scanner myReader = new Scanner(myFile);) {
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
        }catch (FileNotFoundException e){
            System.out.println("Something went wrong");
            e.printStackTrace();

        }

    }
}
