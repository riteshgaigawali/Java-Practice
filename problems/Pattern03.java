/*Print the following pattern: Hollow Rectangle

    * 
    * *
    * * * 
    * * * * 
    
 */

package problems;

public class Pattern03 {

    public static void main(String[] args) {
        int rows = 4;
        int columns = 4;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");

            }

            System.out.println();
        }
    }

}
