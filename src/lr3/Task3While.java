package lr3;

import java.util.Scanner;

public class Task3While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел Фибоначчи:");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println("Количество должно быть положительным");
            in.close();
            return;
        }
        int a = 1, b = 1;
        int i = 0;
        while (i < n) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
            i++;
        }
        System.out.println();
        in.close();
    }
}
