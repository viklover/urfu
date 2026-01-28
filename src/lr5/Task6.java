package lr5;

public class Task6 {
    static class MinMax {
        private int min;
        private int max;

        public MinMax() {
            min = 0;
            max = 0;
        }

        public MinMax(int a) {
            min = a;
            max = a;
        }

        public MinMax(int a, int b) {
            setValues(a, b);
        }

        public void setValues(int a) {
            updateMinMax(a);
        }

        public void setValues(int a, int b) {
            updateMinMax(a);
            updateMinMax(b);
        }

        private void updateMinMax(int value) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        public void print() {
            System.out.println("min = " + min + ", max = " + max);
        }
    }

    public static void main(String[] args) {
        MinMax obj1 = new MinMax(5, 10);
        System.out.print("Constructor (5, 10): ");
        obj1.print();
        obj1.setValues(3);
        System.out.print("After setValues(3): ");
        obj1.print();
        obj1.setValues(15, 1);
        System.out.print("After setValues(15, 1): ");
        obj1.print();
        MinMax obj2 = new MinMax(50);
        System.out.print("Constructor (50): ");
        obj2.print();
    }
}
