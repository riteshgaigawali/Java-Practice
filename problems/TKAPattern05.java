package problems;

class TKAPattern05 {
    public static void main(String[] args) {
        System.out.println();

        int NUM_OF_ROWS = 3;

        for (int i = NUM_OF_ROWS; i >= 1; i--) {
            for (int j = 1; j <= 3; j++) {
                if (j >= i) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }
}