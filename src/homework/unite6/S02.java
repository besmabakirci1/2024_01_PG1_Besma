package homework.unite6;
import java.util.Scanner;

// (Sum the digits in an integer)
// Write a method that computes the sum of the digits in an integer.
// Use the following method header:
// public static int sumDigits(long n)
// For example, sumDigits(234) returns 9 (2 + 3 + 4).
// (Hint: Use the % operator to extract digits, and the / operator to remove the extracted digit.
// For instance, to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use 234 / 10 (= 23).
// Use a loop to repeatedly extract and remove the digit until all the digits are extracted.
// Write a test program that prompts the user to enter an integer and displays the sum of all its digits.
public class S02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        long n = scanner.nextLong();
        int sum = sumDigits(n);
        System.out.println("The sum of the digits is: " + sum);
    }

    public static int sumDigits(long n){
        int sum = 0;
        while (n != 0) {
            sum += n % 10; // Extract the last digit
            n /= 10; // Remove the last digit
        }
        return sum;
    }
}
