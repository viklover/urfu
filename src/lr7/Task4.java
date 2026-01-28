package lr7;

public class Task4 {
    static class FirstClass {
        public char symbol;

        public FirstClass(char symbol) {
            this.symbol = symbol;
        }

        public FirstClass(FirstClass other) {
            this.symbol = other.symbol;
        }

        @Override
        public String toString() {
            return "FirstClass[symbol=" + symbol + "]";
        }
    }

    static class SecondClass extends FirstClass {
        public String text;

        public SecondClass(char symbol, String text) {
            super(symbol);
            this.text = text;
        }

        public SecondClass(SecondClass other) {
            super(other.symbol);
            this.text = other.text;
        }

        @Override
        public String toString() {
            return "SecondClass[symbol=" + symbol + ", text=" + text + "]";
        }
    }

    static class ThirdClass extends SecondClass {
        public int number;

        public ThirdClass(char symbol, String text, int number) {
            super(symbol, text);
            this.number = number;
        }

        public ThirdClass(ThirdClass other) {
            super(other.symbol, other.text);
            this.number = other.number;
        }

        @Override
        public String toString() {
            return "ThirdClass[symbol=" + symbol + ", text=" + text + ", number=" + number + "]";
        }
    }

    public static void main(String[] args) {
        FirstClass obj1 = new FirstClass('A');
        System.out.println("Original: " + obj1.toString());
        FirstClass copy1 = new FirstClass(obj1);
        System.out.println("Copy: " + copy1.toString());

        SecondClass obj2 = new SecondClass('B', "Hello");
        System.out.println("Original: " + obj2.toString());
        SecondClass copy2 = new SecondClass(obj2);
        System.out.println("Copy: " + copy2.toString());

        ThirdClass obj3 = new ThirdClass('C', "World", 42);
        System.out.println("Original: " + obj3.toString());
        ThirdClass copy3 = new ThirdClass(obj3);
        System.out.println("Copy: " + copy3.toString());
    }
}
