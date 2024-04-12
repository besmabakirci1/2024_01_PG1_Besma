package homework.unite3;
import java.util.Scanner;

// (Compute the perimeter of a triangle)
// Write a program that reads three edges for a triangle and computes the perimeter if the input is valid.
// Otherwise, display that the input is invalid.
// The input is valid if the sum of every pair of two edges is greater than the remaining edge.
public class S19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first edge of triangle: ");
        double edge1_a = input.nextDouble();
        System.out.print("Please enter the second edge of triangle: ");
        double edge2_b = input.nextDouble();
        System.out.print("Please enter the third edge of triangle: ");
        double edge3_c = input.nextDouble();
        input.close();
        double perimeterOfTriangle = edge1_a + edge2_b + edge3_c;

        if(edge1_a + edge2_b > edge3_c && edge2_b + edge3_c > edge1_a && edge3_c + edge1_a > edge2_b ){
            System.out.println("The perimeter of a triangle is: " + perimeterOfTriangle);
        } else {
            System.out.print("The input is invalid");
        }
    }
}
