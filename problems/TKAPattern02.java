//Printing Pattern with Alphabets on the Left Diagonal
package problems;

public class TKAPattern02 {
    public static void main(String[] args) {
        System.out.println();

        int NUM_OF_ROWS = 3;

        for (int i = 1; i <= NUM_OF_ROWS; i++) {
            for (int j = 1; j <= i; j++) {
                int a = 64 + j;
                System.out.print((char) a + " ");
            }
            System.out.println();
        }

        System.out.println(
                "----------------------------------------------------------------------------------------------------");

        for (char i = 'A'; i <= 'C'; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}