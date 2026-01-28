package lr4;

public class Task4 {
    public static void main(String[] args) {
        int size = 5;
        int[][] arr = new int[size][];
        int num = 1;
        for (int i = 0; i < size; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                arr[i][j] = num++;
            }
        }
        System.out.println("Right triangle of numbers:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
