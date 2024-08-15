/* Program to find sum of digits of given number. */
package problems;

import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int num = sc.nextInt();
        sc.close();

        int sum = 0, digit;

        while (num != 0) {
            digit = num % 10;
            num = num / 10;
            sum = sum + digit;
        }
        System.out.println("The sum of digits is :- " + sum);
    }
}
