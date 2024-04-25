package homework.unite4;
import java.util.Scanner;

// (Geometry: area of a regular polygon)
// A regular polygon is an n-sided polygon in which all sides are of the same length and all angles have the same degree
// (i.e., the polygon is both equilateral and equiangular).
// The formula for computing the area of a regular polygon is
// Area = (n * (s^2)) / (4 * tan(Math.PI / n))
// Here, s is the length of a side.
// Write a program that prompts the user to enter the number of sides and their length of a regular polygon and displays its area.
// Here is a sample run:
// Enter the number of sides: 5-> "Enter"
// Enter the side: 6.5-> "Enter"
// The area of the polygon is 74.69017017488385
public class S05 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the number of sides of a regular polygon: ");
        double n = input.nextDouble();
        System.out.println("Please enter the sides of a regular polygon: ");
        double s = input.nextDouble();
        input.close();

        double Area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
        System.out.println("The area of the polygon is: " +Area);
    }
}
