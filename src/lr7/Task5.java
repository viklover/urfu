package lr7;

public class Task5 {
    static class SuperClass {
        private String text;

        public SuperClass(String text) {
            this.text = text;
        }

        public void display() {
            System.out.println("SuperClass: text=" + text);
        }

        protected String getText() {
            return text;
        }
    }

    static class SubClassA extends SuperClass {
        protected int number;

        public SubClassA(String text, int number) {
            super(text);
            this.number = number;
        }

        @Override
        public void display() {
            System.out.println("SubClassA: text=" + getText() + ", number=" + number);
        }
    }

    static class SubClassB extends SuperClass {
        protected char symbol;

        public SubClassB(String text, char symbol) {
            super(text);
            this.symbol = symbol;
        }

        @Override
        public void display() {
            System.out.println("SubClassB: text=" + getText() + ", symbol=" + symbol);
        }
    }

    public static void main(String[] args) {
        SuperClass obj1 = new SuperClass("Base");
        SubClassA obj2 = new SubClassA("Alpha", 100);
        SubClassB obj3 = new SubClassB("Beta", 'X');

        System.out.println("Direct calls:");
        obj1.display();
        obj2.display();
        obj3.display();

        System.out.println("\nPolymorphism via SuperClass reference:");
        SuperClass ref;

        ref = obj2;
        ref.display();

        ref = obj3;
        ref.display();
    }
}
