package lr6;

public class Task5 {
    public static int sumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static int sumOfSquaresFormula(int n) {
        return n * (n + 1) * (2 * n + 1) / 6;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum of squares (loop): " + sumOfSquares(n));
        System.out.println("Sum of squares (formula): " + sumOfSquaresFormula(n));
        n = 5;
        System.out.println("n=5: loop=" + sumOfSquares(n)
            + ", formula=" + sumOfSquaresFormula(n));
    }
}
