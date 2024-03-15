package homework.unite3;
import java.util.Scanner;

//(Geometry: point in a rectangle?)
// Write a program that prompts the user to enter a point (x, y) and checks whether
// the point is within the rectangle centered at (0, 0) with width 10 and height 5.
// For example, (2, 2) is inside the rectangle and (6, 4) is outside the rectangle, as shown in Figure 3.7b.
// (Hint: A point is in the rectangle if its horizontal distance to (0, 0) is less than or equal to
// and its vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to cover all cases.)
// Here are two sample runs:
// Enter a point with two coordinates: 2 2-> "Enter"
// Point (2.0, 2.0) is in the rectangle
// Enter a point with two coordinates: 6 4-> "Enter"
// Point (6.0, 4.0) is not in the rectangle
public class S23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a point (x,y): ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if(Math.abs(x) < 5 && Math.abs(y) < 2.5){
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        }else {
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
        }
    }
}
