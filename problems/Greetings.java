package problems;

import java.util.*;

class Greetings {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice between 1-3 :");
        int choice = sc.nextInt();
        sc.close();
        ;

        switch (choice) {
            case 1:
                System.out.print("Hello !");
                break;
            case 2:
                System.out.print("Namaste !");
                break;
            case 3:
                System.out.print("Bonjour !");
                break;
            default:
                System.out.print("Invalid choice ! Please make a choice between 1-3 only.");

        }
    }

}
