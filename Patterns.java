class Patterns {
    final static int NO_OF_ROWS = 5;

    public static void main(String args[]) {

        for (int i = 0; i < NO_OF_ROWS; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = NO_OF_ROWS; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < NO_OF_ROWS; i++) {
            for (int k = NO_OF_ROWS - 1; k > i; k--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < NO_OF_ROWS; i++) {
            for (int k = NO_OF_ROWS - 1; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= NO_OF_ROWS; i++) {
            int diff = NO_OF_ROWS - 1;
            int offset = i;
            for (int j = 0; j < i; j++) {
                System.out.print(offset + " ");
                offset += diff;
                diff--;
            }

            System.out.println();
        }
    }
}