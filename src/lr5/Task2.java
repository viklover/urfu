package lr5;

public class Task2 {
    static class CharRange {
        public char start;
        public char end;

        public void printRange() {
            char from = (start < end) ? start : end;
            char to = (start < end) ? end : start;
            System.out.print("Symbols from '" + from + "' to '" + to + "': ");
            for (char c = from; c <= to; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CharRange range = new CharRange();
        range.start = 'A';
        range.end = 'D';
        range.printRange();
        range.start = 'Z';
        range.end = 'T';
        range.printRange();
    }
}
