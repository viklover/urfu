package lr6;

import java.util.Arrays;

public class Task7 {
    public static int[] charsToCodes(char[] chars) {
        int[] codes = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            codes[i] = (int) chars[i];
        }
        return codes;
    }

    public static void main(String[] args) {
        char[] symbols = {'A', 'B', 'C', 'Z'};
        System.out.println("Symbols: " + Arrays.toString(symbols));
        int[] codes = charsToCodes(symbols);
        System.out.println("Codes: " + Arrays.toString(codes));
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        System.out.println("Word: " + Arrays.toString(word));
        System.out.println("Codes: " + Arrays.toString(charsToCodes(word)));
    }
}
