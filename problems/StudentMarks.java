package problems;

import java.util.*;

public class StudentMarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do {
            System.out.print("Enter an option 0(To exit) or 1(To continue) :");
            option = sc.nextInt();
            if (option == 1) {
                System.out.println("Enter obtained marks out of 100 :");
                int marks = sc.nextInt();
                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks <= 89 && marks >= 60) {
                    System.out.println("This is also Good");
                } else {
                    System.out.println("This is Good as well");
                }
            }

        } while (option == 1);

        sc.close();
        System.out.println("Program exited successfully");
    }

}
