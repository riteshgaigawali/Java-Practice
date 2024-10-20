class JavaLooping {
    public static void main(String[] args) {
        // for loops : program to print all even numbers between 0-50

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // while loop :

        int num = 0;

        while (num <= 5) {
            System.out.println("Hello World !");
            num++;
        }

        // do-while loop:

        do {
            System.out.println("Hello from do-while loop");
            num++;
        } while (num > 10);

        // Nested loop:

        // outer loop
        for (int i = 1; i < 5; i++) {
            // inner loop
            for (int j = 0; j <= i; j++) {
                System.out.print(i + "," + j + "  ");
            }
            System.out.println();
        }

        int weeks = 3;
        int days = 7;
        int i = 1;
        // outer loop
        while (i <= weeks) {
            System.out.println("Week: " + i);

            // inner loop
            for (int j = 1; j <= days; ++j) {
                System.out.println("  Days: " + j);
            }
            ++i;
        }

    }
}
