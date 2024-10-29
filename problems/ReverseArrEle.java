/* Program to display array elements in reverse order. */
package problems;

public class ReverseArrEle {
    public static void main(String[] args) {
        System.out.println();

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
