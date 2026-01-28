package lr3;

import java.util.Scanner;

public class Task5While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int n = in.nextInt();
        int sum = 0;
        int i = 1;
        System.out.println("Числа, удовлетворяющие условию:");
        while (i <= n) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.print(i + " ");
                sum += i;
            }
            i++;
        }
        System.out.println();
        System.out.println("Сумма: " + sum);
        in.close();
    }
}
