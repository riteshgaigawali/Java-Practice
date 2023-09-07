public class JavaArrays {
    public static void main(String args[]) throws Exception {

        //Simple Array
        System.out.println("1D-Array :=");
        int arr1[] = { 1, 5, 3, 2, 4 };
        for (int i = 0; i < arr1.length; i++)
            System.out.print(arr1[i] + " ");
		
        System.out.println();
		
        //2-D Array
        System.out.println("2D-Array :=");
        int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10 } };
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++)
                System.out.print(arr2[i][j] + " ");
            System.out.println();
        }
		
        System.out.println();
		
        //3-D Array
        System.out.println("3D-Array :=");
        int[][][] arr3 = { { { 1, 2, 3 }, { 4, 5, 6 } }, { { 7, 8, 9, 10 }, { 11, 12, 13 } },
                { { 14, 15, 16 }, { 17, 18, 19, 20 } } };
        for (int k = 0; k < arr3.length; k++) {
            for (int l = 0; l < arr3[k].length; l++) {
                for (int m = 0; m < arr3[k][l].length; m++) {
                    System.out.print(arr3[k][l][m] + " ");
                }
                System.out.println();
            }
			
            System.out.println();
        }

    }
}
