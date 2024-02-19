package homework.unite2;

import java.util.Scanner;

// (Geometry: Distance of Two Points)
// This program calculates the distance between two points (x1, y1) and (x2, y2) entered by the user.
// The distance formula is √((x2 - x1)^2 + (y2 - y1)^2).
// Math.pow(a, 0.5) is used to compute the square root of a (√a).
//Enter x1 and y1: 1.5 -3.4-> "Enter"
//Enter x2 and y2: 4 5-> "Enter"
//The distance between the two points is 8.764131445842194
public class S15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter x1 : ");
        double x1 = input.nextDouble();
        System.out.print("Please enter y1 : ");
        double y1 = input.nextDouble();
        System.out.print("Please enter x2 : ");
        double x2 = input.nextDouble();
        System.out.print("Please enter y2 : ");
        double y2 = input.nextDouble();
        input.close();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between the two points is: " + distance);
    }
}
