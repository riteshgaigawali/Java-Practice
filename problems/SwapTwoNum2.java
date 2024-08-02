/* Swapping of two integers without using third variable. */

package problems;

import java.util.Scanner;

public class SwapTwoNum2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two integer numbers to swap : ");
        int num1 = scan.nextInt(); // 50
        int num2 = scan.nextInt(); // 10
        scan.close();
        System.out.printf("Before swapping num1 = %d and num2 = %d.\n", num1, num2);
        num1 = num1 + num2; // 60
        num2 = num1 - num2; // 50
        num1 = num1 - num2; // 10
        System.out.printf("After swapping num1 = %d and num2 = %d.", num1, num2);
    }

}
