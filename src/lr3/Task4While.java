package lr3;

import java.util.Scanner;

public class Task4While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = in.nextInt();
        System.out.println("Введите второе число:");
        int b = in.nextInt();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int i = min;
        while (i <= max) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        in.close();
    }
}
