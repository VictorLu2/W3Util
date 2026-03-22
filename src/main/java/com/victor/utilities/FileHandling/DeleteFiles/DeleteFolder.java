package com.victor.utilities.FileHandling.DeleteFiles;

import java.io.File;

public class DeleteFolder {
    public static void main(String[] args){
        // Absolute path or relative path
        File myObj = new File("/Users/blvck_reindeer/Documents/Backend/Java/W3Util/DirectoryToDelete");
        if (myObj.delete()){
            System.out.println("Deleted the folder");
        }else {
            System.out.println("Failed to delete the folder");
        }
    }
}
