package homework.unite3;

import java.util.Scanner;

// (Palindrome number)
// Write a program that prompts the user to enter a three-digit integer and determines whether it is a palindrome number.
// A number is palindrome if it reads the same from right to left and from left to right.
// Here is a sample run of this program:
// Enter a three-digit integer: 121 -> "Enter"
// 121 is a palindrome
// Enter a three-digit integer: 123 -> "Enter"
// 123 is not a palindrome
public class S12 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter a three-digit integer:");
        int number = input.nextInt();

        int digit1= number / 100 ;
        int remaining = number % 100;
        int digit3 = remaining % 10;
        if (digit1 == digit3){
            System.out.println( number + " is a palindrome ");
        }
        else {
            System.out.println( number + " is not a palindrome ");
        }



    }
}
