package lr8;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Task3 {
    public static void main(String[] args) {
        String inputFile = "input_task3.txt";
        String outputFile = "output_task3.txt";
        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";

        // Create input file with Russian text (Pushkin)
        try (BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                    new FileOutputStream(inputFile), StandardCharsets.UTF_8))) {
            bw.write("Я помню чудное мгновенье"); bw.newLine();
            bw.write("Передо мной явилась ты"); bw.newLine();
            bw.write("Как мимолетное виденье"); bw.newLine();
            bw.write("Как гений чистой красоты"); bw.newLine();
            System.out.println("Input file created with Pushkin's poem");
        } catch (IOException e) {
            System.out.println("Error creating input file: " + e);
            return;
        }

        // Process file
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream(inputFile), StandardCharsets.UTF_8));
             BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                    new FileOutputStream(outputFile), StandardCharsets.UTF_8))) {

            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                StringBuilder consonantWords = new StringBuilder();
                int count = 0;

                for (String word : words) {
                    if (word.isEmpty()) continue;
                    char firstChar = word.charAt(0);
                    // Check if first char is a letter and not a vowel
                    if (Character.isLetter(firstChar) &&
                        vowels.indexOf(firstChar) == -1) {
                        if (consonantWords.length() > 0) {
                            consonantWords.append(" ");
                        }
                        consonantWords.append(word);
                        count++;
                    }
                }

                bw.write("Line " + lineNumber + " (" + count + " words): ");
                bw.write(consonantWords.toString());
                bw.newLine();
                lineNumber++;
            }
            System.out.println("Output file created successfully");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        // Display output file
        System.out.println("\nOutput file contents:");
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream(outputFile), StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading output: " + e);
        }
    }
}
