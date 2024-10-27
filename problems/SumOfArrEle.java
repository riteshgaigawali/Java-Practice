/* Progarm to find sum of all elements of an array. */
package problems;

public class SumOfArrEle {
    public static void main(String[] args) {
        System.out.println();

        int[] arr = { 10, 80, 50, 47, 95 };
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of array element is :- " + sum);

    }

}
