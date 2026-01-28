package lr5;

public class Task4 {
    static class CharAndInt {
        public char symbol;
        public int number;

        public CharAndInt(int code, char c) {
            symbol = c;
            number = code;
        }

        public CharAndInt(double value) {
            int intPart = (int) value;
            symbol = (char) intPart;
            double fractional = value - intPart;
            number = (int) (fractional * 100);
        }

        public void print() {
            System.out.println("Symbol: " + symbol + ", Number: " + number);
        }
    }

    public static void main(String[] args) {
        CharAndInt obj1 = new CharAndInt(100, 'X');
        System.out.print("Constructor (int, char): ");
        obj1.print();
        CharAndInt obj2 = new CharAndInt(65.1267);
        System.out.print("Constructor (65.1267): ");
        obj2.print();
        CharAndInt obj3 = new CharAndInt(66.9915);
        System.out.print("Constructor (66.9915): ");
        obj3.print();
    }
}
