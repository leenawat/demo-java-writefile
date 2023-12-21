package com.example.demojavawritefile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByteToFIleISO88591 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("filename-iso-8859-1.txt")) {
            byte[] bytes = "à¸ à¸²à¸©à¸²à¹\u0084à¸\u0097à¸¢".getBytes("ISO-8859-1");
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
