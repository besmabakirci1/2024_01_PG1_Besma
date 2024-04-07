package homework.unite3;
import java.util.Scanner;
// (Geometry: two circles)
// Write a program that prompts the user to enter the center coordinates and radii of two circles and determines
// whether the second circle is inside the first or overlaps with the first, as shown in Figure 3.10.
// (Hint: circle2 is inside circle1 if the distance between the two centers 6 = |r1 - r2|
// and circle2 overlaps circle1 if the distance between the two centers <= r1 + r2.
// Test your program to cover all cases.)
// Here are the sample runs:

// Enter circle1's center x-, y-coordinates, and radius: 0.5 5.1 13-> "Enter"
// Enter circle2's center x-, y-coordinates, and radius: 1 1.7 4.5-> "Enter"
// circle2 is inside circle1

// Enter circle1's center x-, y-coordinates, and radius: 3.4 5.7 5.5-> "Enter"
// Enter circle2's center x-, y-coordinates, and radius: 6.7 3.5 3-> "Enter"
// circle2 overlaps circle1

// Enter circle1's center x-, y-coordinates, and radius: 3.4 5.5 1-> "Enter"
// Enter circle2's center x-, y-coordinates, and radius: 5.5 7.2 1-> "Enter"
// circle2 does not overlap circle1
public class S29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter circle1's center x-, y-coordinates, and radius:");
        double circle1CenterXCoordinates = input.nextDouble();
        double circle1CenterYCoordinates = input.nextDouble();
        double circle1Radius = input.nextDouble();
        System.out.println("Please enter circle2's center x-, y-coordinates, and radius:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double circle2Radius = input.nextDouble();
        input.close();
        if ( Math.abs(circle1Radius - circle2Radius) == 6 ){
            System.out.println("");
        }

    }
}
