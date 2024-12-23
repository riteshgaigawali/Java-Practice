/*Program to print fibonacci sequence till given range. */
package problems;

import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range to print Fibonacci series : ");
        int range = sc.nextInt();
        sc.close();

        int startNum = 0, nextNum = 1, sum = 0;

        System.out.print("Fibonacci series: " + startNum + " " + nextNum + " ");

        for (int i = 3; i <= range; i++) {
            sum = startNum + nextNum;
            System.out.print(sum + " ");
            startNum = nextNum;
            nextNum = sum;
        }

    }

}
