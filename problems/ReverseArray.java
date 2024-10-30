package problems;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println();

        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int arr2[] = new int[arr1.length];
        int in = 0;
        for (int i = arr1.length; i >= 0; i--) {
            arr2[in] = arr1[i];
            in++;
        }

        System.out.println(arr2.length);

    }
}
