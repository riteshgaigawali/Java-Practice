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

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
