package wk10;

public class AlternatingSquare {
    public static void main(String[] args) {
        char a = '-', b = '*';
        int size = 4;

        printAlternatingSquare(a, b, size);
    }

    public static void printAlternatingSquare(char a, char b, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(j % 2 == 0) {
                    System.out.print(a + " ");
                }
                else {
                    System.out.print(b + " ");
                }
            }
            System.out.println();
        }
    }
}
