package lr6;

public class Task4 {
    public static int doubleFactorial(int n) {
        int result = 1;
        for (int i = n; i >= 1; i -= 2) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("6!! = " + doubleFactorial(6));
        System.out.println("5!! = " + doubleFactorial(5));
        System.out.println("7!! = " + doubleFactorial(7));
        System.out.println("8!! = " + doubleFactorial(8));
    }
}
