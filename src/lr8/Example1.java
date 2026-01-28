package lr8;

import java.io.File;

public class Example1 {
    public static void main(String[] args) {
        try {
            // Create file in current directory
            File f1 = new File("MyFile1.txt");
            f1.createNewFile();
            if (f1.exists()) {
                System.out.println("File created!");
                System.out.println("Full path 1: " + f1.getAbsolutePath());
            }
            
            // Create file on disk E
            File f2 = new File("E:\\MyFile2.txt");
            f2.createNewFile();
            System.out.println("Full path 2: " + f2.getAbsolutePath());
            
            // Create nested directories
            File f3 = new File("E:\\Folder1\\Folder2\\Folder3");
            f3.mkdirs();
            System.out.println("Full path 3: " + f3.getAbsolutePath());
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}