package homework.unite2;

import java.util.Scanner;

//(Compute the volume of a cylinder)
// Write a program that reads in the radius and length of a cylinder and computes the area and volume using the following formulas:
//area = radius * radius * p
//volume = area * length
//Here is a sample run:
//Enter the radius and length of a cylinder: 5.5 12-> "Enter"
//The area is 95.0331
//The volume is 1140.4
public class S02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the value of radius: ");
        double radius = input.nextDouble();
        System.out.println("Please enter the value of length: ");
        double length = input.nextDouble();
        input.close();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.println("Volume: " + volume );
        System.out.println("Area: " + area);
    }
}
