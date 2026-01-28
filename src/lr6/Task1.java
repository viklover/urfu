package lr6;

public class Task1 {
    static class SymbolText {
        public char symbol;
        public String text;

        public void setValue(char c) {
            symbol = c;
        }

        public void setValue(String s) {
            text = s;
        }

        public void setValue(char[] arr) {
            if (arr.length == 1) {
                symbol = arr[0];
            } else {
                text = new String(arr);
            }
        }

        public void print() {
            System.out.println("Symbol: " + symbol + ", Text: " + text);
        }
    }

    public static void main(String[] args) {
        SymbolText obj = new SymbolText();
        obj.setValue('A');
        obj.print();
        obj.setValue("Hello");
        obj.print();
        obj.setValue(new char[]{'X'});
        obj.print();
        obj.setValue(new char[]{'W', 'o', 'r', 'l', 'd'});
        obj.print();
    }
}
