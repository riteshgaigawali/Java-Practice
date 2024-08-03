/*Print the following pattern: Inverted numbered half pyramid
 
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
    
 */

package problems;

public class Pattern09 {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

}
