// Printing Pattern with Numbers on the Left Diagonal
package problems;

public class TKAPattern01 {
    public static void main(String[] args) {

        System.out.println();

        int NUM_OF_ROWS = 3;

        for (int i = 1; i <= NUM_OF_ROWS; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
