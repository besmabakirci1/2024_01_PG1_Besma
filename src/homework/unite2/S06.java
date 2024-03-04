package homework.unite2;
import java.util.Scanner;

// (Sum the digits in an integer)
// Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer.
// For example, if an integer is 932, the sum of all its digits is 14.
// Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit.
// For instance, 932 % 10 = 2 and 932 / 10 = 93.
// Here is a sample run:
// Enter a number between 0 and 1000: 999-> "Enter"
// The sum of the digits is 27
public class S06 {
    public static void main(String[] args) {
        System.out.print("please enter a number btw 0 and 1000 : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        int digit1 = number % 10;
        number /= 10;
        int digit2 = number % 10;
        number /= 10;
        int digit3 = number;
        int sum = digit1 + digit2 + digit3;

        System.out.println("The sum of the digits is: " + sum);
    }
}
