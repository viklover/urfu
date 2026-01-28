package lr5;

public class Task1 {
    static class CharHolder {
        private char symbol;

        public void setValue(char c) {
            symbol = c;
        }

        public int getCode() {
            return (int) symbol;
        }

        public void print() {
            System.out.println("Symbol: " + symbol + ", Code: " + (int) symbol);
        }
    }

    public static void main(String[] args) {
        CharHolder holder = new CharHolder();
        holder.setValue('A');
        System.out.println("Code of symbol: " + holder.getCode());
        holder.print();
        holder.setValue('Z');
        holder.print();
    }
}
