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
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter number1: ");
        int n1 = scanner.nextInt();
        System.out.println("Please enter number2: ");
        int n2 = scanner.nextInt();
        int d = Math.min(n1, n2);
        while (d >= 1) {
            if (n1 % d == 0 && n2 % d == 0) {
                System.out.println("The greatest common divisor of " + n1 + " and " + n2 + " is " + d);
                break;
            }
            d--;
        }

        /* if (n1 > n2){
            for (int i = 1 ; i < n1 ; i++){
                if (n1 % i == n2 % i ){
şöyle bir şeyde biraz mantıklı gibi geldi ama emin olamadım
.
                }
            }
        }
*/
    }
}
