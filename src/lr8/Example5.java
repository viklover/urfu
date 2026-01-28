package lr8;

import java.io.*;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filename => ");
        String fname = sc.nextLine();
        
        try {
            // Create file
            File f1 = new File(fname);
            f1.createNewFile();
            System.out.println("Full file path: " + f1.getAbsolutePath());
            
            System.out.print("Enter number of lines to write => ");
            int n = sc.nextInt();
            
            // Create stream for writing
            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));
            sc.nextLine(); // Clear buffer
            
            for (int i = 0; i < n; i++) {
                System.out.print("Enter line to write => ");
                String s = sc.nextLine();
                dOut.writeUTF(s);
            }
            
            dOut.flush();
            dOut.close();
            
            // Read and display created file
            System.out.println("\nReading from file:");
            DataInputStream dIn = new DataInputStream(new FileInputStream(f1));
            try {
                while (true) {
                    System.out.println(dIn.readUTF());
                }
            } catch (EOFException e) {
                // End of file
            }
            dIn.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}