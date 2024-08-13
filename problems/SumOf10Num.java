/* Sum of 1-10 numbers. */

package problems;

public class SumOf10Num {
    public static void main(String[] args) {
        int range = 10, sum = 0;

        for (int i = 1; i <= range; i++) {
            sum += i;
        }
        System.out.println("The sum is :" + sum);
    }
}
