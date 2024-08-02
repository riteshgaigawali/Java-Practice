/* Print all even numbers till the given range by user. */

package problems;

import java.util.*;

class EvenNumTillN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number till you want to print even numbers: ");
        int range = sc.nextInt();
        sc.close();

        for (int i = 0; i <= range; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
