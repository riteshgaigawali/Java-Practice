/*Print the following pattern: Inverted Half Peramid
 
           *
         * * 
       * * * 
     * * * * 
    
 */

package problems;

public class Pattern05 {

    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
