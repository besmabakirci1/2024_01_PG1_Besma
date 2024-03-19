package homework.unite4;
import java.util.Scanner;
import static java.lang.Math.cos;
// (Random points on a circle)
// Write a program that generates three random points on a circle centered at (0, 0) with radius 40
// and display three angles in a triangle formed by these three points, as shown in Figure 4.7a.
// (Hint: Generate a random angle (alfa) in radians between 0 and 2p,
// as shown in Figure 4.7b and the point determined by this angle is (radius * cos(a), radius * sin(a)).)

public class S06 {
    public static void main(String[] args) {
        double radius = 40.0;
        double angle1 = Math.random() * 2 * Math.PI;
        double angle2 = Math.random() * 2 * Math.PI;
        double angle3 = Math.random() * 2 * Math.PI;
        double x1 = radius * Math.cos(angle1);
        double y1 = radius * Math.sin(angle1);
        double x2 = radius * Math.cos(angle2);
        double y2 = radius * Math.sin(angle2);
        double x3 = radius * Math.cos(angle3);
        double y3 = radius * Math.sin(angle3);

    }
}
