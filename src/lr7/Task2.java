package lr7;

public class Task2 {
    static class SuperClass {
        private String text;

        public SuperClass(String text) {
            this.text = text;
        }

        public void setValue(String text) {
            this.text = text;
        }

        public int getLength() {
            return text.length();
        }

        protected String getText() {
            return text;
        }

        public void print() {
            System.out.println("SuperClass: text=" + text + ", length=" + getLength());
        }
    }

    static class SubClass extends SuperClass {
        public int number;

        public SubClass(String text, int number) {
            super(text);
            this.number = number;
        }

        public void setValue() {
            super.setValue("");
            this.number = 0;
        }

        @Override
        public void setValue(String text) {
            super.setValue(text);
        }

        public void setValue(int number) {
            this.number = number;
        }

        public void setValue(String text, int number) {
            super.setValue(text);
            this.number = number;
        }

        public void print() {
            System.out.println("SubClass: text=" + getText() + ", number=" + number);
        }
    }

    public static void main(String[] args) {
        SuperClass obj1 = new SuperClass("Hello");
        obj1.print();
        System.out.println("Length: " + obj1.getLength());

        SubClass obj2 = new SubClass("World", 42);
        obj2.print();

        obj2.setValue("Java", 100);
        obj2.print();

        obj2.setValue(999);
        obj2.print();

        obj2.setValue();
        obj2.print();
    }
}
