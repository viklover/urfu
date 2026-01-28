package lr6;

import java.util.Arrays;

public class Task8 {
    public static double average(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Array: " + Arrays.toString(arr1));
        System.out.println("Average: " + average(arr1));
        int[] arr2 = {10, 20, 30};
        System.out.println("Array: " + Arrays.toString(arr2));
        System.out.println("Average: " + average(arr2));
    }
}
