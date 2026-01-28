package lr8;

import java.io.*;

public class Example2 {
    public static void main(String[] args) {
        try {
            // Read from file
            InputStream inFile = new FileInputStream("E:\\MyFile1.txt");
            int data;
            while ((data = inFile.read()) != -1) {
                System.out.print((char) data);
            }
            inFile.close();
            
            System.out.println("\n\n");
            
            // Read from URL (example with local file instead)
            InputStream inUrl = new FileInputStream("E:\\MyFile1.txt"); // Using file for simplicity
            while ((data = inUrl.read()) != -1) {
                System.out.print((char) data);
            }
            inUrl.close();
            
            System.out.println("\n\n");
            
            // Read from byte array
            byte[] byteArray = {65, 66, 67, 68, 69}; // A, B, C, D, E
            ByteArrayInputStream inArray = new ByteArrayInputStream(byteArray);
            while ((data = inArray.read()) != -1) {
                System.out.print((char) data);
            }
            inArray.close();
            
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}