package homework.unite3;
import java.util.Scanner;

// (Algebra: solve quadratic equations)
// The two roots of a quadratic equation a * (x^2) + (b * x) + c = 0 can be obtained using the following formula:
// Section 3.2
// r1 = (-b + Math.sqrt (Math.pow(b,2) - 4 * a * c)) / (2 * a)
// and r2 = -b - Math.sqrt (Math.pow(b,2) - 4 * a * c) / (2 * a)
// b^2 - (4 * a * c) is called the discriminant of the quadratic equation.
// If it is positive, the equation has two real roots.
// If it is zero, the equation has one root.
// If it is negative, the equation has no real roots.

// Write a program that prompts the user to enter values for a, b, and c and displays the result based on the discriminant.
// If the discriminant is positive, display two roots. If the discriminant is 0, display one root.
// Otherwise, display “The equation has no real roots”.
// Note that you can use Math.pow(x, 0.5) to compute Math.sqrt(x).
// Here are some sample runs:
// Enter a, b, c: 1.0 3 1 -> "Enter"
// The equation has two roots -0.381966 and -2.61803
// Enter a, b, c: 1 2.0 1 -> "Enter"
// The equation has one root -1
// Enter a, b, c: 1 2 3 -> "Enter"
// The equation has no real roots

public class S01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the value for a: ");
        double a = input.nextDouble();
        System.out.print("Please enter the value for b: ");
        double b = input.nextDouble();
        System.out.print("Please enter the value for c: ");
        double c = input.nextDouble();
        input.close();

        double discriminant = Math.pow(b,2) - (4 * a * c) ;
        double r1 = (-b + Math.sqrt (Math.pow(b,2) - 4 * a * c)) / (2 * a);
        double r2 = (-b - Math.sqrt (Math.pow(b,2) - 4 * a * c)) / (2 * a);

        if (discriminant > 0){
            System.out.println("The equation has two real roots " +r1 +r2);
        }
        if (discriminant == 0){
            System.out.println("The equation has one root " +r1);
        }
        if (discriminant < 0){
            System.out.println("The equation has no real roots ");
        }
    }
}