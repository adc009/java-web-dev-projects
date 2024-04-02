package org.launchcode;

import java.util.Scanner;
public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius:");

        double radiusCircle = input.nextDouble();

        //double areaCircle = 3.14 * radiusCircle * radiusCircle;
        double areaCircle = Circle.getArea(radiusCircle);
        System.out.println("The area of a circle of radius " + radiusCircle + " is : " + areaCircle);

    }
}
