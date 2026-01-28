package lr6;

import java.util.Arrays;

public class Task6 {
    public static int[] takeFirst(int[] arr, int count) {
        if (count >= arr.length) {
            return Arrays.copyOf(arr, arr.length);
        }
        return Arrays.copyOf(arr, count);
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original: " + Arrays.toString(original));
        int[] first3 = takeFirst(original, 3);
        System.out.println("First 3: " + Arrays.toString(first3));
        int[] first7 = takeFirst(original, 7);
        System.out.println("First 7: " + Arrays.toString(first7));
        int[] first15 = takeFirst(original, 15);
        System.out.println("First 15 (copy): " + Arrays.toString(first15));
    }
}
