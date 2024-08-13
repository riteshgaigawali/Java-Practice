/* Program to check a number is prime or not inputed by user. */

package problems;

import java.util.*;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime or not: ");
        int num = sc.nextInt();
        sc.close();

        // Least optimized and most simple way :-
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("This is a prime number.");
        } else {
            System.out.println("This is not a prime number.");
        }

        // Another optimized way to do this (-1 iterations) :-

        int count1 = 2;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count1++;
                break;
            }
        }
        if (count1 == 2) {
            System.out.println("This is a prime number.");
        } else {
            System.out.println("This is not a prime number.");
        }

        // Another optimized way to do this (num/2 iteration ) :-

        int count2 = 2;

        for (int i = 2; i < num / 2; i++) {

            if (num % i == 0) {
                count2++;
                break;
            }
        }
        if (count2 == 2) {
            System.out.println("This is a prime number.");
        } else {
            System.out.println("This is not a prime number.");
        }

        // Another optimized way to do this (most optimized way) :-

        int count3 = 2;

        for (int i = 2; i < num / Math.sqrt(num); i++) {
            if (num % i == 0) {
                count3++;
                break;
            }
        }
        if (count3 == 2) {
            System.out.println("This is a prime number.");
        } else {
            System.out.println("This is not a prime number.");
        }

    }

}
