package lr3;

import java.util.Scanner;

public class Task2IfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название дня недели:");
        String day = in.nextLine().toLowerCase();
        int number;
        if (day.equals("понедельник")) {
            number = 1;
        } else if (day.equals("вторник")) {
            number = 2;
        } else if (day.equals("среда")) {
            number = 3;
        } else if (day.equals("четверг")) {
            number = 4;
        } else if (day.equals("пятница")) {
            number = 5;
        } else if (day.equals("суббота")) {
            number = 6;
        } else if (day.equals("воскресенье")) {
            number = 7;
        } else {
            System.out.println("Ошибка: некорректное название дня недели");
            in.close();
            return;
        }
        System.out.println("Порядковый номер: " + number);
        in.close();
    }
}
