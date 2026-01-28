package lr8;

import java.io.*;

public class Example3 {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("E:\\MyFile1.txt")) {
            byte[] buffer = new byte[5];
            int bytesRead;
            
            System.out.println("Reading with 5-byte buffer:");
            while ((bytesRead = fin.read(buffer)) != -1) {
                System.out.write(buffer, 0, bytesRead);
            }
            
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}