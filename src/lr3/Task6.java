package lr3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println("Ошибка: размер должен быть положительным");
            in.close();
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 2 + i * 5;
        }
        System.out.println("Массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        in.close();
    }
}
