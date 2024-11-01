/* Program to Show the Frequency of Each Element in the Array */
package problems;

public class FrequencyOfEle {

    public static void main(String[] args) {
        System.out.println();

        int[] arr = { 8, 5, 6, 8, 4, 6, 9, 7, 5, 2, 1, 3 };

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i] + " : " + count);
        }

    }

}
