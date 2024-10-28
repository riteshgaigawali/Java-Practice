/* Program to find smallest element in the array. */
package problems;

public class SmallestEleOfArr {
    public static void main(String[] args) {
        System.out.println();

        int[] arr = { 7, 8, 6, 7, 1, 6, 5, 8 };
        int smallestElement = arr[0]; // consider first element as smallest

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= smallestElement) { // check if the next element is smallest or not
                smallestElement = arr[i]; // if next element is smallest consider that element as smallest and repeat
                                          // the step utill end of array
            }
        }

        System.out.println(smallestElement);

    }
}
