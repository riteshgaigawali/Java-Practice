import java.util.Scanner;
import java.io.DataInputStream;

class JavaInputs {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = sc.nextLine();
        System.out.println("Enter your roll number :");
        int roll_num = sc.nextInt();
        System.out.println("Enter your aggreegate percentage :");
        float percentage = sc.nextFloat();
        System.out.printf("Hi %s roll number %d, your aggregate percentage are %.2f.\n", name, roll_num, percentage);
        sc.close();

        /*
         * ---This is old method for input stream and allowed only upto JDK 1.1.---
         * ---In latest versions of java we can use BufferedReader instead of this.---
         * float principalAmount;
         * float rateOfInterest;
         * int years;
         * try {
         * DataInputStream dis = new DataInputStream(System.in);
         * System.out.print("Enter principal amount : ");
         * System.out.flush();
         * principalAmount = dis.readFloat();
         * System.out.print("Enter rate of interest : ");
         * System.out.flush();
         * rateOfInterest = dis.readFloat();
         * System.out.print("Enter number of years : ");
         * System.out.flush();
         * years = dis.readInt();
         * float interestAmount = principalAmount * rateOfInterest * years;
         * System.out.printf("The interest amount is %.2f.", interestAmount);
         * } catch (Exception e) {
         * 
         * }
         */
    }
}