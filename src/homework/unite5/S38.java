package homework.unite5;
import java.util.Scanner;

// (Decimal to octal)
// Write a program that prompts the user to enter a decimal integer and displays its corresponding octal value.
// Don’t use Java’s Integer .toOctalString(int) in this program.
public class S38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a decimal integer: ");
        int decimalInteger = scanner.nextInt();
        scanner.close();

        String octalValue = "";
        int quotient = decimalInteger; // Quotient = Bölüm

        while (quotient > 0) {
            int remainder = quotient % 8;
            quotient = quotient / 8;
            octalValue += remainder ;
        }
        for (int i = octalValue.length() - 1; i >= 0; i--) {
            System.out.print(octalValue.charAt(i));
        }

    }
}
