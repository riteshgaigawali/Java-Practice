/* Progaram to find if the given number is armstrong or not. */
package problems;

import java.util.Scanner;

public class ArmstrongNum {

    public static void main(String[] args) {

        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's armstrong or not :- ");
        int num = sc.nextInt();
        sc.close();

        int digit, count = 0, temp = num, sum = 0;

        // count number of digits for the power
        while (num > 0) {
            digit = num % 10;
            num = num / 10;
            count++;
        }

        // reinitialize num because of above code the num value is changed to 0
        num = temp;

        // add the power of digits
        while (num > 0) {
            digit = num % 10;
            num = num / 10;
            sum += Math.pow(digit, count);
        }

        if (sum == temp) {
            System.out.printf("%d is an armstrong number.", temp);
        } else {
            System.out.printf("%d is not an armstrong number.", temp);
        }

    }

}
