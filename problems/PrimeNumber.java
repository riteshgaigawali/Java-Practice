package problems;

import java.util.*;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime or not: ");
        int num = sc.nextInt();
        sc.close();

        int flag = 0, medium;

        if (num == 0 || num == 1) {
            System.out.println("This is not a prime number.");
        } else {
            medium = num / 2;
            for (int i = 2; i <= medium; i++) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("This is not a prime number.");
            } else {
                System.out.println("This is a prime number.");
            }
        }

    }

}
