package problems;

import java.util.*;

class Calculator {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int num1 = sc.nextInt();
        System.out.print("Enter second number :");
        int num2 = sc.nextInt();
        System.out.print(
                "Enter operation to be performed among Addition(+), Substraction(-), Multiplication(*), Division(/), Modulo(%) :");
        sc.nextLine();
        String choice = sc.nextLine();
        sc.close();

        switch (choice) {
            case "+":
                System.out.print("Addition : " + (num1 + num2));
                break;
            case "-":
                System.out.print("Susbstraction : " + (num1 - num2));
                break;
            case "*":
                System.out.print("Multiplication : " + num1 * num2);
                break;
            case "/":
                System.out.print("Division : " + num1 * num2);
                break;
            case "%":
                System.out.print("Modulo : " + num1 % num2);
                break;
            default:
                System.out.print("Invalid choice ! Please pass a valid operation.");

        }

    }

}
