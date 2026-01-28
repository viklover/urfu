package lr4;

public class Task2 {
    public static void main(String[] args) {
        int size = 10;
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
