package homework.unite4;
import java.util.Scanner;

// (Geometry: area of a hexagon)
// The area of a hexagon can be computed using the following formula (s is the length of a side):
// Area = (6 * (s^2)) / 4 * tan(Math.PI / 6)
// Write a program that prompts the user to enter the side of a hexagon and displays its area.
// Here is a sample run:
// Enter the side: 5.5-> "Enter"
// The area of the hexagon is 78.59
public class S04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of a side: ");
        double s = input.nextDouble();
        double Area = (6 * Math.pow(s,2)) / (4 * Math.tan(Math.PI / 6));
        System.out.println("The area of the hexagon is: " +Area);
    }
}
