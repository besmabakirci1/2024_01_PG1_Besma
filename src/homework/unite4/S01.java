package homework.unite4;
import java.util.Scanner;

// (Geometry: area of a pentagon)
// Write a program that prompts the user to enter the length from the center of a pentagon to a vertex and computes
// the area of the pentagon, as shown in the following figure.
// The formula for computing the area of a pentagon is Area = (5 * (s^2)) / 4 * tan(Math.PI / 5)
// s is the length of a side. The side can be computed using the formula s = 2 * r * sin(Math.PI / 5),
//where r is the length from the center of a pentagon to a vertex. Round up two digits after the decimal point.
// Here is a sample run:
// Enter the length from the center to a vertex: 5.5-> "Enter"
// The area of the pentagon is 71.92
public class S01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length from the center of a pentagon to the vertex: ");
        double r = input.nextDouble(); // r is the length from the center to a vertex

        double s = 2 * r * Math.sin(Math.PI / 5); //s is the length of the side
        double Area = (5 * Math.pow(s , 2)) / (4 * Math.tan(Math.PI / 5));

        System.out.printf("The area of the pentagon is %.2f%n", Area);
    }
}
