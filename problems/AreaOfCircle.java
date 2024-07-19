package problems;

import java.util.*;

class AreaOfCircle {

    public static void main(String args[]) {
        final double PI = Math.PI;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the diameter of the circle :");
        double diameter = sc.nextDouble();
        sc.close();

        double radius = diameter / 2;

        System.out.printf("The radius of cirlce is %.2f \n", radius);

        double area = PI * radius * radius;

        System.out.printf("The area of the cirlce is %.2f", area);
    }

}
