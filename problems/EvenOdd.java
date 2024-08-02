/* Program to check number is even or odd given by user. */

package problems;

import java.util.*;

class EvenOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        sc.close();

        if (num % 2 == 0) {
            System.out.printf("The number %d is an even number. \n", num);
        } else {
            System.out.printf("The number %d is an odd number.", num);
        }

    }
}