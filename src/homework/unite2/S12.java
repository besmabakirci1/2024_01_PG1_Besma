package homework.unite2;
import java.util.Scanner;

// (Physics: finding runway length)
// Given an airplane’s acceleration a and take-off speed v,
// you can compute the minimum runway length needed for an airplane to take off
// using the following formula: length = v^2/2a
// Write a program that prompts the user to enter v in meters/second (m/s)
// and the acceleration a in meters/second squared (m/s2), and displays the minimum run-way length.
// Here is a sample run:
// Enter speed and acceleration: 60 3.5-> "Enter"
// The minimum runway length for this airplane is 514.286
public class S12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value of speed, meter / second (m/s): ");
        double v = input.nextDouble();
        System.out.println("Please enter the value of acceleration, meter / second square (m/s^2): ");
        double a = input.nextDouble();
        input.close();

        double length = (v * v)/(2 * a);

        System.out.println("the minimum runway length needed for an airplane to take off is : " + length);
    }
}
