/* Check wether the number is zero, positive, or negative */

package problems;

import java.util.*;

public class NumCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is zero, positive, or negative: ");
        int num = sc.nextInt();
        sc.close();

        if (num == 0) {
            System.out.println("The number is zero.");
        } else if (num > 0) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("The number is negative.");
        }
    }

}
