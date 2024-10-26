package problems;

public class TKAPattern06 {

    public static void main(String[] args) {
        System.out.println();

        int NUM_OF_ROWS = 3;

        for (int i = 1; i <= NUM_OF_ROWS; i++) {
            for (int j = 1; j <= NUM_OF_ROWS; j++) {
                if (i <= j) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }

}
