package lr3;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        int size = 10;
        int[] arr = new int[size];
        Random rand = new Random();
        System.out.println("Исходный массив:");
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Отсортированный по убыванию:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
