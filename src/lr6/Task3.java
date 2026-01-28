package lr6;

public class Task3 {
    public static int max(int... numbers) {
        int result = numbers[0];
        for (int n : numbers) {
            if (n > result) result = n;
        }
        return result;
    }

    public static int min(int... numbers) {
        int result = numbers[0];
        for (int n : numbers) {
            if (n < result) result = n;
        }
        return result;
    }

    public static double avg(int... numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        System.out.println("max(3, 7, 2, 9, 4) = " + max(3, 7, 2, 9, 4));
        System.out.println("min(3, 7, 2, 9, 4) = " + min(3, 7, 2, 9, 4));
        System.out.println("avg(3, 7, 2, 9, 4) = " + avg(3, 7, 2, 9, 4));
        int[] arr = {10, 20, 30, 40};
        System.out.println("max(arr) = " + max(arr));
        System.out.println("min(arr) = " + min(arr));
        System.out.println("avg(arr) = " + avg(arr));
    }
}
