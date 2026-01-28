package lr8;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        String inputFile = "input_task2.dat";
        String outputFile = "output_task2.dat";

        // Create input file with test data
        try (DataOutputStream dos = new DataOutputStream(
                new FileOutputStream(inputFile))) {
            dos.writeUTF("First line of text");
            dos.writeUTF("Second line of text");
            dos.writeDouble(3.14);
            dos.writeDouble(-2.5);
            dos.writeDouble(7.8);
            dos.writeDouble(-1.0);
            dos.writeDouble(9.99);
            System.out.println("Input file created successfully");
        } catch (IOException e) {
            System.out.println("Error creating input file: " + e);
            return;
        }

        // Read from input and write filtered data to output
        try (DataInputStream dis = new DataInputStream(
                new FileInputStream(inputFile));
             DataOutputStream dos = new DataOutputStream(
                new FileOutputStream(outputFile))) {

            // Read two strings
            String line1 = dis.readUTF();
            String line2 = dis.readUTF();
            System.out.println("Line 1: " + line1);
            System.out.println("Line 2: " + line2);

            // Write second line to output
            dos.writeUTF(line2);

            // Read 5 doubles and write positive ones
            System.out.println("Numbers:");
            for (int i = 0; i < 5; i++) {
                double num = dis.readDouble();
                System.out.println("  " + num);
                if (num > 0) {
                    dos.writeDouble(num);
                }
            }
            System.out.println("Output file created successfully");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        // Verify output file
        System.out.println("\nVerifying output file:");
        try (DataInputStream dis = new DataInputStream(
                new FileInputStream(outputFile))) {
            System.out.println("Second line: " + dis.readUTF());
            System.out.println("Positive numbers:");
            while (dis.available() > 0) {
                System.out.println("  " + dis.readDouble());
            }
        } catch (IOException e) {
            System.out.println("Error reading output: " + e);
        }
    }
}
