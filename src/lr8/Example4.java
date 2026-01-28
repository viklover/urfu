package lr8;

import java.io.*;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        try {
            // Create directory
            File dir = new File("E:\\My");
            dir.mkdir();
            
            // Create first file and write float numbers
            File f1 = new File("E:\\My\\numIsh.txt");
            f1.createNewFile();
            
            Scanner sc = new Scanner(System.in);
            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            
            System.out.println("How many float numbers to write to file?");
            int count = sc.nextInt();
            
            System.out.println("Enter numbers:");
            for (int i = 0; i < count; i++) {
                wr.writeFloat(sc.nextFloat());
            }
            wr.flush();
            wr.close();
            
            // Create second file and copy numbers
            File f2 = new File("E:\\My\\numRez.txt");
            f2.createNewFile();
            
            DataInputStream rd = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));
            
            try {
                while (true) {
                    float number = rd.readFloat();
                    wr.writeFloat(number);
                    System.out.println("Number: " + number);
                }
            } catch (EOFException e) {
                // End of file reached
            }
            
            wr.flush();
            wr.close();
            rd.close();
            
        } catch (IOException e) {
            System.out.println("End of file");
        }
    }
}