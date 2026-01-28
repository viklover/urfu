package lr3;

public class Task7 {
    public static void main(String[] args) {
        int size = 10;
        char[] arr = new char[size];
        char c = 'а';
        for (int i = 0; i < size; i++) {
            arr[i] = c;
            c += 2;
        }
        System.out.println("Массив в прямом порядке:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Массив в обратном порядке:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
