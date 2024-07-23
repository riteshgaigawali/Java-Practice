package problems;

import java.util.*;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime or not: ");
        int num = sc.nextInt();
        sc.close();

        boolean flag = false;

        for (int i = 2; i < num; i++) {
            if (num == 0 || num == 1) {
                System.out.print("This is not prime number.");
            } else if (num % i == 0) {
                flag = true;
            } else {
                flag = false;
            }
        }
    }

}
