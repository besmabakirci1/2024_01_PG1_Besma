package homework.unite3;
import java.util.Scanner;

// (Algebra: Solve 2 * 2 linear equations)
// A linear equation can be solved using Cramer’s rule given in Programming Exercise 1.13.
// Write a program that prompts the user to enter a, b, c, d, e, and f and displays the result.
// If ad - bc is 0, report that “The equation has no solution.”
// Programming Exercises 109
// Enter a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0 -> "Enter"
// x is -2.0 and y is 3.0
// Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0 -> "Enter"
// The equation has no solution
public class S03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Please enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Please enter the value of c: ");
        double c = input.nextDouble();
        System.out.print("Please enter the value of d: ");
        double d = input.nextDouble();
        System.out.print("Please enter the value of e: ");
        double e = input.nextDouble();
        System.out.print("Please enter the value of f: ");
        double f = input.nextDouble();
        input.close();

        if ((a * d) == (b * c)){
            System.out.println("The equation has no solution." );
        }
        else {
            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);

            System.out.println("x: " +x);
            System.out.println("y: " +y);
        }
    }
}
