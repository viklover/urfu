package lr7;

public class Task1 {
    static class SuperClass {
        private String text;

        public SuperClass(String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return "SuperClass[text=" + text + "]";
        }

        protected String getText() {
            return text;
        }
    }

    static class SubClass extends SuperClass {
        private String additionalText;

        public SubClass(String text) {
            super(text);
            this.additionalText = "";
        }

        public SubClass(String text, String additionalText) {
            super(text);
            this.additionalText = additionalText;
        }

        @Override
        public String toString() {
            return "SubClass[text=" + getText() + ", additionalText=" + additionalText + "]";
        }
    }

    public static void main(String[] args) {
        SuperClass obj1 = new SuperClass("Hello");
        System.out.println(obj1.toString());

        SubClass obj2 = new SubClass("World");
        System.out.println(obj2.toString());

        SubClass obj3 = new SubClass("Java", "Programming");
        System.out.println(obj3.toString());
    }
}
