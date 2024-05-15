package homework.unite5;
import java.util.Scanner;

// (Compute the greatest common divisor)
// Another solution for Listing 5.9 to find the greatest common divisor of two integers n1 and n2 is as follows:
// First find d to be the minimum of n1 and n2,
// then check whether d, d-1, d-2, ..., 2, or 1 is a divisor for both n1 and n2 in this order.
// The first such common divisor is the greatest common divisor for n1 and n2.
// Write a program that prompts the user to enter two positive integers and displays the gcd.
public class S14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = 1;
        int number2 = 1;
        int min = 1;
        int gdc = 1;

        System.out.print("Enter the first number: ");
        number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        number2 = scanner.nextInt();

        min = Math.min(number1, number2);

        for (int i = min; i > 0; i--) {
            if ((number1 % i == 0) && (number2 % i == 0)) {
                gdc = i;
                break;
            }
        }
        System.out.println("The greatest common divisor is: " + gdc);
    }
}

