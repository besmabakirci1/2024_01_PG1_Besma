package Homeworks.Unite2;

import java.util.Scanner;

// (Geometry: Area of a Hexagon)
//Write a program that prompts the user to enter the side of a hexagon and displays its area.
//The formula for computing the area of a hexagon is Area = (3√3/2)*s^2 where s is the length of a side.
// Here is a sample run:
//Enter the side: 5.5-> "Enter"
//The area of the hexagon is 78.5895
public class S16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the side's length of hexagon to display its area: ");
        double side_of_hexagon = input.nextDouble();
        input.close();

        double area = (Math.pow( side_of_hexagon, 2) * 3 * Math.sqrt( 3 )) / 2;

        System.out.print("The area of the hexagon is: " + area);
    }
}
