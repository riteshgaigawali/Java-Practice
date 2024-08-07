package problems;

import java.util.*;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year (YYYY) to check if it is leap : ");
        int year = sc.nextInt();
        sc.close();

        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("This is a leap year.");
        } else if (year % 100 != 0 && year % 4 == 0) {
            System.out.println("This is leap year.");
        } else {
            System.out.println("This is not a leap year.");
        }

        // This is another way :-
        // if (year % 100 == 0) {
        // if (year % 400 == 0)
        // System.out.println("This is a leap year.");
        // else
        // System.out.println("This not is a leap year.");

        // } else if (year % 4 == 0) {
        // System.out.println("This is a leap year.");
        // } else {
        // System.out.println("This is not a leap year.");

        // }

    }
}
