// Printing Pattern with Stars in a Left Diagonal
package problems;

class TKAPatter {
    public static void main(String[] args) {
        System.out.println();

        int NUM_OF_ROWS = 3;

        for (int i = 0; i < NUM_OF_ROWS; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}