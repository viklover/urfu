package lr5;

public class Task5 {
    static class LimitedInt {
        private int value;

        public LimitedInt() {
            value = 0;
        }

        public LimitedInt(int val) {
            setValue(val);
        }

        public void setValue() {
            value = 0;
        }

        public void setValue(int val) {
            if (val > 100) {
                value = 100;
            } else {
                value = val;
            }
        }

        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        LimitedInt obj1 = new LimitedInt();
        System.out.println("Default constructor: " + obj1.getValue());
        LimitedInt obj2 = new LimitedInt(50);
        System.out.println("Constructor with 50: " + obj2.getValue());
        LimitedInt obj3 = new LimitedInt(150);
        System.out.println("Constructor with 150: " + obj3.getValue());
        obj1.setValue(75);
        System.out.println("After setValue(75): " + obj1.getValue());
        obj1.setValue(200);
        System.out.println("After setValue(200): " + obj1.getValue());
        obj1.setValue();
        System.out.println("After setValue(): " + obj1.getValue());
    }
}
