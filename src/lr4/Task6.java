package lr4;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 5;
        int[][] arr = new int[rows][cols];
        int num = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = num++;
            }
        }
        System.out.println("Original array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        Random rand = new Random();
        int delRow = rand.nextInt(rows);
        int delCol = rand.nextInt(cols);
        System.out.println("Deleting row " + delRow + " and column " + delCol);
        int[][] result = new int[rows - 1][cols - 1];
        int newI = 0;
        for (int i = 0; i < rows; i++) {
            if (i == delRow) continue;
            int newJ = 0;
            for (int j = 0; j < cols; j++) {
                if (j == delCol) continue;
                result[newI][newJ] = arr[i][j];
                newJ++;
            }
            newI++;
        }
        System.out.println("Result array:");
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
