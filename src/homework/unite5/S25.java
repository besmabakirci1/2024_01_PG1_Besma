package homework.unite5;
import java.util.Scanner;

// (Compute p)
// You can approximate p by using the following series:
// Math.PI = 4 * ((1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + ... + Math.pow(-1, i+1) / (2 * i - 1))
// Write a program that displays the PI value for i = 10000, 20000, ..., and 100000.
public class S25 {
    public static void main(String[] args) {
        for (int i = 10000 ; i <= 1000000; i += 10000){
            double piApproximation = 0.0;
            for (int k = 0; k < i; k++) {
                piApproximation += Math.pow(-1, k) / (2 * k + 1);
            }
            piApproximation *= 4; // Multiply by 4 to get Pi
            System.out.printf("Approximation of PI for i = %d: %.15f%n", i, piApproximation);
        }
    }
}
// anlamadım.