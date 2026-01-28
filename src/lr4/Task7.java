package lr4;

public class Task7 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 5;
        int[][] arr = new int[rows][cols];
        int num = 1;
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                arr[top][j] = num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = num++;
            }
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    arr[bottom][j] = num++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = num++;
                }
                left++;
            }
        }
        System.out.println("Spiral fill:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
