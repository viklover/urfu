package lr8;

import java.io.*;

public class Example6 {
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;
        
        try {
            in = new FileReader("E:\\MyFile1.txt"); // File for reading
            out = new FileWriter("E:\\MyFile2.txt", true); // File for writing (append mode)
            
            int oneByte;
            while ((oneByte = in.read()) != -1) {
                out.append((char) oneByte); // Append data
                System.out.print((char) oneByte);
            }
            
        } catch (IOException e) {
            System.out.println("Error!");
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }
}