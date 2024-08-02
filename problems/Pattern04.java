/*Print the following pattern: Inverted Half Peramid
 
    * * * * 
    * * *
    * *
    *
    
 */

package problems;

public class Pattern04 {

    public static void main(String[] args) {
        int rows = 4;

        for (int i = rows; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
