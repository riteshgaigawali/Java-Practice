/* Progaram to find if the given number is palindrome or not. Ex : 121, 222, 313 */
package problems;

import java.util.*;

public class PalindromicNum {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int num = sc.nextInt();
        sc.close();

        int digit, reverseNum = 0, temp = num;

        while (num > 0) {
            digit = num % 10;
            num = num / 10;
            reverseNum = (reverseNum * 10) + digit;
        }
        if (reverseNum == temp) {
            System.out.printf("%d is a palindromic number.", temp);
        } else {
            System.out.printf("%d is NOT a palindromic number.", temp);
        }
    }
}
