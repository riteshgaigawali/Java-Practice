/* Program to Create the Array in Reverse Order. */
package problems;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println();

        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int arr2[] = new int[arr1.length];
        int index = arr1.length;

        // approach - 1
        for (int i = 0; i < arr1.length; i++) {
            arr2[--index] = arr1[i];
        }

        // approach - 2
        // for (int i = 0, k = arr1.length-1; i < arr1.length; i++, k--) {
        // arr2[k] = arr1[i];
        // }

        for (int j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j] + " ");
        }

    }
}
