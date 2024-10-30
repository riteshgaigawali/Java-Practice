/* Program to Create the Array in Reverse Order. */
package problems;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println();

        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int arr2[] = new int[arr1.length];
        int index = arr1.length;

        for (int i = 0; i < arr1.length; i++) {
            arr2[--index] = arr1[i];
            System.out.print(arr2[index] + " ");
        }

    }
}
