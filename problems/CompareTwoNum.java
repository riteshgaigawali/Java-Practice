/* Program to compare two numbers inputed by user. */

package problems;

import java.util.*;

class CompareTwoNum {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter second number :");
        int num2 = sc.nextInt();
        sc.close();

        if (num1 == num2) {
            System.out.println("Both the numbers are equal.");
        } else if (num1 > num2) {
            System.out.println("Fisrt number is greater that second number.");
        } else {
            System.out.println("Second number is greater than first number.");
        }
    }

}
