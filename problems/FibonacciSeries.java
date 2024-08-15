/*Program to print fibonacci sequence till given range. */
package problems;

import java.util.*;

public class FibonacciSeries {

    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range till fibonacci series to be printed : ");
        int range = sc.nextInt();
        sc.close();

        int startNum = 0, nextNum = 1, sum = 0;

        System.out.print("Fibonacci series :- " + startNum + " ");
        for (int i = 0; i < range - 1; i++) {
            sum = startNum + nextNum;
            System.out.print(sum + " ");
            nextNum = startNum;
            startNum = sum;
        }
    }

}
