package org.launchcode;

import java.util.Scanner;
public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radiusCircle = -1;
        System.out.println("Enter a radius:");
        while (radiusCircle < 0) {
            radiusCircle = input.nextDouble();
            if (radiusCircle < 0) {
                System.out.println("Please enter a non-negative number.");
            }
        }

        //double areaCircle = 3.14 * radiusCircle * radiusCircle;
        double areaCircle = Circle.getArea(radiusCircle);
        System.out.println("The area of a circle of radius " + radiusCircle + " is : " + areaCircle);

    }
}
