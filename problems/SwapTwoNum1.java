package problems;

import java.util.*;

class SwapTwoNum1 {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two integer numbers to swap : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();
        System.out.printf("Before swapping num1 = %d and num2 = %d.\n", num1, num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.printf("After swapping num1 = %d and num2 = %d.", num1, num2);

    }

}