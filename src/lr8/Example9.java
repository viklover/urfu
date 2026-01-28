package lr8;

import java.io.*;

public class Example9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        
        try {
            // Create streams with encoding
            br = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream("E:\\MyFile1.txt"), "UTF-8"));
            
            bw = new BufferedWriter(
                new OutputStreamWriter(
                    new FileOutputStream("E:\\MyFile2.txt"), "UTF-8"));
            
            // Copy information
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                bw.write(lineCount + ": " + s);
                bw.newLine();
            }
            
        } catch (IOException e) {
            System.out.println("Error!");
        } finally {
            if (br != null) br.close();
            if (bw != null) {
                bw.flush();
                bw.close();
            }
        }
    }
}