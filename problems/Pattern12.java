/*Print the following pattern: numbered pyramid.

        1 
      2 1 2    
    3 2 1 2 3   
  4 3 2 1 2 3 4  
5 4 3 2 1 2 3 4 5 
    
 */

package problems;

public class Pattern12 {

    public static void main(String[] args) {
        int rows = 5;

        System.out.println();
        for (int i = 1; i <= rows; i++) {

            for (int j = rows; j > i; j--) {
                System.out.print("  ");
            }

            int num = i;
            for (int k = 1; k <= i; k++) {
                System.out.print(num-- + " ");
            }

            for (int l = 2; l <= i; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }

        System.out.println("Another way :- ");

        int n = 5;
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // first part
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // second part
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
