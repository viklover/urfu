package lr8;

import java.io.*;

public class Example10 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter out = null;
        
        try {
            br = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream("E:\\MyFile1.txt"), "UTF-8"));
            
            out = new PrintWriter("E:\\MyFile2.txt", "UTF-8");
            
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + s);
            }
            
            // Example with System.out
            PrintWriter consoleOut = new PrintWriter(System.out);
            consoleOut.println("Total lines processed: " + lineCount);
            consoleOut.flush();
            
        } catch (IOException e) {
            System.out.println("Error!");
        } finally {
            try {
                if (br != null) br.close();
                if (out != null) {
                    out.flush();
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}