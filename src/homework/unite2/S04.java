package homework.unite2;

import java.util.Scanner;

// (Convert pounds into kilograms)
// Write a program that converts pounds into kilo-grams.
// The program prompts the user to enter a number in pounds, converts it to kilograms, and displays the result.
// One pound is 0.454 kilograms.
// Here is a sample run:
// Enter a number in pounds: 55.5 -> "Enter"
// 55.5 pounds is 25.197 kilograms
public class S04 {
    public static void main(String[] args) {
        System.out.println("Please enter a number in pounds: ");
        Scanner input = new Scanner(System.in);
        input.close();

        double pound = input.nextDouble();
        double kilogram = pound  /0.454 ;

        System.out.println("The total kilogram is : " + kilogram);

    }
}
