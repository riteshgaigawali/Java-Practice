package problems;

import java.util.*;

class SumOFnNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any natural number :");
        int n = scan.nextInt();
        scan.close();

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            sum += i;

        }
        System.out.printf("The sum of all numbers till %d is: %d\n", n, sum);
    }

}
