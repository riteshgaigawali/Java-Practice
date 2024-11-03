/* Program to Arrange the Array in Ascending Order */
package problems;

public class SortArray {
    public static void main(String[] args) {
        System.out.println();

        int[] arr = { 83, 4, 5, 95, 6, 42, 54 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = 0;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

    }
}
