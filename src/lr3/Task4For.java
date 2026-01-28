package lr3;

import java.util.Scanner;

public class Task4For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = in.nextInt();
        System.out.println("Введите второе число:");
        int b = in.nextInt();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        in.close();
    }
}
