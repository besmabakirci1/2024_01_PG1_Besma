package homework.unite3;
import java.util.Scanner;

//(Geometry: intersecting point ,keşisen nokta,.)
// Two points on line 1 are given as (x1, y1) and (x2, y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a–b.
// The intersecting point of the two lines can be found by solving the following linear equation:
// x * (y1 -y2) - y * (x1 -x2) = x1 * (y1 -y2) - y1 * (x1 -x2)
// x * (y3 -y4) - y * (x3 -x4) = x3 * (y3 -y4) - y3 * (x3 -x4)
// This linear equation can be solved using Cramer’s rule (see Programming Exercise 3.3).
// If the equation has no solutions, the two lines are parallel (Figure 3.8c).
// Write a program that prompts the user to enter four points and displays the intersecting point.
// ax + by =e
// cx + dy =f
// X = ed - bf / ad - bc
// Y = af - ec / ad - bc
/* from Exercise 3.3:
  if ((a * d) == (b * c)){
        System.out.println("The equation has no solution." );
        } else {
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);
        System.out.println("x: " +x);
        System.out.println("y: " +y);
}*/
public class S25 {
    public static void main(String[] args) {
        // Prompt the user to enter four points

        Scanner input = new Scanner (System.in);
        System.out.print("Please enter the first point on line1 (x1, y1): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Please enter the second point on line1 (x2, y2): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("Please enter the first point on line2 (x3, y3): ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        System.out.print("Please enter the second point on line2 (x4, y4): ");
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        // Calculate the intersecting point
        // Get a, b, c, d, e, f
        double a = y1 - y2;
        double b = -(x1 - x2);
        double c = y3 - y4;
        double d = -(x3 - x4);
        double e = a * x1 + b * y1;
        double f = c * x3 + d * y3;

        if ((a * d - b * c) == 0) {
            System.out.println("The lines are parallel.");
        } else {
            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);
            System.out.println("The intersecting point is at (" + x + ", " + y + ")");
        }
    }
}
