package homework.unite3;
import java.util.Scanner;

// (Geometry: points in triangle?)
// Suppose a right triangle is placed in a plane as shown below. The right-angle point is placed at (0, 0),
// and the other two points are placed at (200, 0), and (0, 100).
// Write a program that prompts the user to enter a point with x- and y-coordinates and determines whether the point is inside the triangle.
// Here are the sample runs:
// note: Please look at the book for the graph
// Enter a point's x- and y-coordinates: 100.5 25.5-> "Enter"
// The point is in the triangle
// Enter a point's x- and y-coordinates: 100.5 50.5-> "Enter"
// The point is not in the triangle
public class S27 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double point_x = input.nextDouble();
        double point_y = input.nextDouble();
        System.out.print("Enter a point's x- and y-coordinates: " );
        input.close();
        double point1_x = 0;
        double point1_y = 0;
        double point2_x = 200;
        double point2_y = 0;
        double point3_x = 0;
        double point3_y = 100;
        if ( Math.abs(point_x) < point2_x && (Math.abs(point_y) < point3_y)){
            System.out.println("The point is in the triangle");
        }else System.out.println("The point is not in the triangle");
// Sormakta fayda var akmıyor tıkandım teşekkürler.
    }
}
