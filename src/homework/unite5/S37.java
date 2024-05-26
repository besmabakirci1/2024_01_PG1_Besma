package homework.unite5;
import java.util.Scanner;

// (Decimal to binary)
// Write a program that prompts the user to enter a decimal integer and displays its corresponding binary value.
// Don’t use Java’s Integer .toBinaryString(int) in this program.
// --------
// if you want to understand how the conversion works you can check this example: https://www.youtube.com/watch?v=q0-fSHYoC_8
public class S37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a decimal integer: ");
        int decimalInteger = scanner.nextInt();
        scanner.close();

        String binaryValue = "";
        int quotient = decimalInteger; // Quotient = Bölüm

        while (quotient > 0) {
            int remainder = quotient % 2;
            quotient = quotient / 2;
            binaryValue = remainder + binaryValue;
        }

        System.out.println("Binary value: " + binaryValue);
    }
}
