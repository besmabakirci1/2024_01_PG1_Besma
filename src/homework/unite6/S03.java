package homework.unite6;
import java.util.Scanner;

// (Palindrome integer) Write the methods with the following headers
/// Return the reversal of an integer, i.e., reverse(456) returns 654
// public static int reverse(int number)

/// Return true if number is a palindrome
// public static boolean isPalindrome(int number)

// Use the reverse method to implement isPalindrome.
// A number is a palindrome if its reversal is the same as itself.
// Write a test program that prompts the user to enter an integer
// and reports whether the integer is a palindrome.
public class S03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer to report if it is a palindrome or not: ");
        int number = scanner.nextInt();
        if (isPalindrome (number)){
            System.out.println(number + " is a palindrome integer.");
        }else{
            System.out.println(number + " is not a palindrome integer.");
        }
    }

    public static int reserve(int number) {
        int reserved = 0;
        while (number != 0){
            reserved = reserved * 10 + number % 10;
            number /= 10;
        }
        return reserved;
    }

    public static boolean isPalindrome(int number) {
        return number == reserve(number);
    }
}