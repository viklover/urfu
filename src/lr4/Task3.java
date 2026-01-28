package lr4;

public class Task3 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 8;
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = 2;
            }
        }
        System.out.println("Rectangle of 2s:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
