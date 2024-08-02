/* Print month of a year based on user input. */

package problems;

import java.util.*;

class Months {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month's number (1-12) :");
        int choice = sc.nextInt();
        sc.close();

        switch (choice) {
            case 1:
                System.out.print("January");
                break;
            case 2:
                System.out.print("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("September");
                break;
            case 10:
                System.out.print("Octomber");
                break;
            case 11:
                System.out.print("November");
                break;
            case 12:
                System.out.print("December");
                break;
            default:
                System.out.print("Invalid choice ! Please make choice between 1-12 only.");
        }
    }
}
