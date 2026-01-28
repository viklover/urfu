package lr8;

import java.io.*;

public class Example7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        
        try {
            br = new BufferedReader(new FileReader("E:\\File1.txt"), 1024); // 1KB buffer
            bw = new BufferedWriter(new FileWriter("E:\\File2.txt"));
            
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                System.out.println(line);
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