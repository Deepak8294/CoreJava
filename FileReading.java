package com;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReading {

    public static void main(String[] args) {
        String path = ("D:myTestFile.txt");
        FileInputStream fip = null;

        try {
            File file = new File(path);
            fip = new FileInputStream(file);
            System.out.println("File content is:");
            int c = 0;
            while ((c = fip.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fip.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}