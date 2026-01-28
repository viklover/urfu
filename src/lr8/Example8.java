package lr8;

import java.io.*;

public class Example8 {
    public static void readAllByByte(Reader in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n end \n");
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        try {
            // From file with encoding
            InputStream inFile = new FileInputStream("E:\\MyFile1.txt");
            Reader rFile = new InputStreamReader(inFile, "UTF-8");
            readAllByByte(rFile);
            inFile.close();
            rFile.close();
            
            System.out.println("\n\n");
            
            // From URL (using local file for example)
            InputStream inUrl = new FileInputStream("E:\\MyFile1.txt");
            Reader rUrl = new InputStreamReader(inUrl, "UTF-8");
            readAllByByte(rUrl);
            inUrl.close();
            rUrl.close();
            
            System.out.println("\n\n");
            
            // From byte array
            InputStream inArray = new ByteArrayInputStream(new byte[]{5, 8, 3, 9, 11});
            Reader rArray = new InputStreamReader(inArray, "UTF-8");
            readAllByByte(rArray);
            inArray.close();
            rArray.close();
            
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}