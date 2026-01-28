package lr1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = in.nextInt();
        int less = num - 1;
        int more = num + 1;
        int sum = less + num + more;
        int square = sum * sum;
        System.out.println("Число на 1 меньше: " + less);
        System.out.println("Введённое число: " + num);
        System.out.println("Число на 1 больше: " + more);
        System.out.println("Квадрат суммы: " + square);
        in.close();
    }
}
