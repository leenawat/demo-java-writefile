package com.example.demojavawritefile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.nio.charset.Charset;

public class WriteToFile {
    public static void main(String[] args) {
//        try {
//            FileWriter myWriter = new FileWriter("filename.txt");
////            myWriter.write("Files in Java might be tricky, but it is fun enough!");
//            byte[] bytes = "ภาษาไทย".getBytes(Charset.forName("TIS-620"));
//            myWriter.write(bytes);
//            myWriter.close();
//            System.out.println("Successfully wrote to the file.");
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
        try (FileOutputStream fos = new FileOutputStream("filename-tis620.txt")) {
            byte[] bytes = "ภาษาไทย".getBytes(Charset.forName("TIS-620"));
            fos.write(bytes);
            //fos.close // no need, try-with-resources auto close
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}