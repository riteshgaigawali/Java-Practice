// Printing Pattern with Stars in a Left-Mirror Diagonal
package problems;

public class TKAPattern04 {
    public static void main(String[] args) {
        System.out.println();

        int NUM_OF_ROWS = 3;

        // Approach - 1
        for (int i = 0; i < NUM_OF_ROWS; i++) {
            for (int j = 1; j <= (NUM_OF_ROWS - i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Approach - 2
        for (int i = NUM_OF_ROWS; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}