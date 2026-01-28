package lr6;

import java.util.Arrays;

public class Task10 {
    public static int[] minMax(int... numbers) {
        int min = numbers[0];
        int max = numbers[0];
        for (int n : numbers) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] result1 = minMax(5, 2, 8, 1, 9, 3);
        System.out.println("minMax(5, 2, 8, 1, 9, 3) = " + Arrays.toString(result1));
        int[] result2 = minMax(100, -50, 75, 0, 25);
        System.out.println("minMax(100, -50, 75, 0, 25) = " + Arrays.toString(result2));
        int[] result3 = minMax(42);
        System.out.println("minMax(42) = " + Arrays.toString(result3));
    }
}
