package lr6;

public class Task2 {
    static class Counter {
        private static int count = 0;

        public static void showAndIncrement() {
            System.out.println("Current value: " + count);
            count++;
        }
    }

    public static void main(String[] args) {
        Counter.showAndIncrement();
        Counter.showAndIncrement();
        Counter.showAndIncrement();
        Counter.showAndIncrement();
        Counter.showAndIncrement();
    }
}
