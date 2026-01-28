package lr6;

import java.util.Arrays;

public class Task9 {
    public static void reverseSwap(char[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] arr1 = {'A', 'B', 'C', 'D', 'E'};
        System.out.println("Before: " + Arrays.toString(arr1));
        reverseSwap(arr1);
        System.out.println("After: " + Arrays.toString(arr1));
        char[] arr2 = {'H', 'e', 'l', 'l', 'o', '!'};
        System.out.println("Before: " + Arrays.toString(arr2));
        reverseSwap(arr2);
        System.out.println("After: " + Arrays.toString(arr2));
    }
}
