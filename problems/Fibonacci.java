package problems;

import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range to print Fibonacci series : ");
        int range = sc.nextInt();
        sc.close();

        int previousNum = 0;
        int nextNum = 1;
        int sum = 0;
        System.out.print("Fibonacci series: " + previousNum + " " + nextNum + " ");

        for (int i = 3; i <= range; i++) {
            sum = previousNum + nextNum;
            System.out.print(sum + " ");
            previousNum = nextNum;
            nextNum = sum;
        }

    }

}
