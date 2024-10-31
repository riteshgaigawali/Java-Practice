/* Progarm to Locate Duplicate Elements in an Array. */
package problems;

public class DuplicateEleInArr {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 5, 1, 3, 2, 4, 2, 3, 2, };

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
