package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        try(var in = new Scanner(System.in)) {
            System.out.println("Input lastname: ");
            var lastname = in.nextLine();
            System.out.println("Input firstname: ");
            var firstname = in.nextLine();
            System.out.println("Input patronymic: ");
            var patronymic = in.nextLine();
            System.out.println("Hello: " + lastname + " " + firstname + " " + patronymic);
        }
    }
}
