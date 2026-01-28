package lr3;

import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        int size = 10;
        int[] arr = new int[size];
        Random rand = new Random();
        System.out.println("Массив:");
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(20);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальное значение: " + min);
        System.out.print("Индексы минимального элемента: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] == min) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
