class JavaConditionalStatements {
    public static void main(String args[]) {
        int a = 3, b = 20, c = 30;
        // Simple if-else statement:
        if (a < b) {
            System.out.printf("%d is less than %d", a, b);
        } else {
            System.out.printf("%d is greater than %d", a, b);
        }

        System.out.println(" ");

        // Ladder if-else or if-else if
        if (a > b && a > c) {
            System.out.printf("%d is the greatest number.", a);
        } else if (b > a && b > c) {
            System.out.printf("%d is the greatest number", b);
        } else {
            System.out.printf("%d is the greatest number", c);
        }

        System.out.println(" ");

        // Switch case

        int day = 8;

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thrusday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Please make a valid choice..");
        }

    }

}