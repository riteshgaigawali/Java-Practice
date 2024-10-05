/* Print reverse of the given number. */
package problems;

import java.util.*;

public class ReverseOfNum {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to be reversed :- ");
        int num = sc.nextInt();
        sc.close();

        int digit, reverseNum = 0;

        while (num > 0) {
            digit = num % 10;
            num = num / 10;
            reverseNum = (reverseNum * 10) + digit;
        }
        System.out.println("The reverse of number is :- " + reverseNum);
    }
}
