package lr3;

public class Task8 {
    public static void main(String[] args) {
        char[] arr = new char[10];
        String vowels = "AEIOUY";
        int index = 0;
        char c = 'A';
        while (index < 10 && c <= 'Z') {
            if (vowels.indexOf(c) == -1) {
                arr[index] = c;
                index++;
            }
            c++;
        }
        System.out.println("Прописные согласные английского алфавита:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
