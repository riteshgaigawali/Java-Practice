package problems;

import java.util.*;

class TableOfNumber {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        int num = sc.nextInt();
        sc.close();

        System.out.printf("%d * %d = %d \n", num, 1, num * 1);
        System.out.printf("%d * %d = %d \n", num, 2, num * 2);
        System.out.printf("%d * %d = %d \n", num, 3, num * 3);
        System.out.printf("%d * %d = %d \n", num, 4, num * 4);
        System.out.printf("%d * %d = %d \n", num, 5, num * 5);
        System.out.printf("%d * %d = %d \n", num, 6, num * 6);
        System.out.printf("%d * %d = %d \n", num, 7, num * 7);
        System.out.printf("%d * %d = %d \n", num, 8, num * 8);
        System.out.printf("%d * %d = %d \n", num, 9, num * 9);
        System.out.printf("%d * %d = %d \n", num, 10, num * 10);
    }

}
