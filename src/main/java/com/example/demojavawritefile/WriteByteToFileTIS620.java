package com.example.demojavawritefile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class WriteByteToFileTIS620 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("filename-tis620.txt")) {
            byte[] bytes = "ภาษาไทย".getBytes("TIS-620");
            System.out.println("size : " + bytes.length);
            fos.write(bytes);
            //fos.close // no need, try-with-resources auto close
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
