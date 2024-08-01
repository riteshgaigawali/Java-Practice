/*Print the following pattern: Solid Rectangle

    * * * * *
    * * * * *
    * * * * *
    * * * * *
    
 */

package problems;

class Pattern01 {

    public static void main(String args[]) {

        int rows = 4;
        int columns = 5;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
