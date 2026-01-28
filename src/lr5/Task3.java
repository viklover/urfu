package lr5;

public class Task3 {
    static class TwoIntegers {
        public int a;
        public int b;

        public TwoIntegers() {
            a = 0;
            b = 0;
        }

        public TwoIntegers(int value) {
            a = value;
            b = value;
        }

        public TwoIntegers(int first, int second) {
            a = first;
            b = second;
        }

        public void print() {
            System.out.println("a = " + a + ", b = " + b);
        }
    }

    public static void main(String[] args) {
        TwoIntegers obj1 = new TwoIntegers();
        System.out.print("No arguments: ");
        obj1.print();
        TwoIntegers obj2 = new TwoIntegers(5);
        System.out.print("One argument (5): ");
        obj2.print();
        TwoIntegers obj3 = new TwoIntegers(10, 20);
        System.out.print("Two arguments (10, 20): ");
        obj3.print();
    }
}
