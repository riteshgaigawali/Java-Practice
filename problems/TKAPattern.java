// Printing Pattern with Stars in a Left-Mirror Diagonal
package problems;

public class TKAPattern {
    public static void main(String[] args) {
        System.out.println();

        int NUM_OF_ROWS = 3;

        for (int i = 0; i < NUM_OF_ROWS; i++) {
            for (int j = 1; j <= (NUM_OF_ROWS - i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}