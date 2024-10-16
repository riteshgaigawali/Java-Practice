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

        while (num > 0) {
            digit = num % 10;
            num = num / 10;
            count++;
        }
        num = temp;

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
