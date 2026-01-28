package lr7;

public class Task3 {
    static class FirstClass {
        public int number;

        public FirstClass(int number) {
            this.number = number;
        }

        public void setValue(int number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return "FirstClass[number=" + number + "]";
        }
    }

    static class SecondClass extends FirstClass {
        public char symbol;

        public SecondClass(int number, char symbol) {
            super(number);
            this.symbol = symbol;
        }

        public void setValue(int number, char symbol) {
            this.number = number;
            this.symbol = symbol;
        }

        @Override
        public String toString() {
            return "SecondClass[number=" + number + ", symbol=" + symbol + "]";
        }
    }

    static class ThirdClass extends SecondClass {
        public String text;

        public ThirdClass(int number, char symbol, String text) {
            super(number, symbol);
            this.text = text;
        }

        public void setValue(int number, char symbol, String text) {
            this.number = number;
            this.symbol = symbol;
            this.text = text;
        }

        @Override
        public String toString() {
            return "ThirdClass[number=" + number + ", symbol=" + symbol + ", text=" + text + "]";
        }
    }

    public static void main(String[] args) {
        FirstClass obj1 = new FirstClass(10);
        System.out.println(obj1.toString());

        SecondClass obj2 = new SecondClass(20, 'A');
        System.out.println(obj2.toString());

        ThirdClass obj3 = new ThirdClass(30, 'B', "Hello");
        System.out.println(obj3.toString());

        obj3.setValue(100, 'Z', "World");
        System.out.println(obj3.toString());
    }
}
