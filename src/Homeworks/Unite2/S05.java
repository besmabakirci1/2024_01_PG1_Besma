package Homeworks.Unite2;//(Financial application: calculate tips)
//Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total.
// For example: if the user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gratuity and $11.5 as total.
// Here is a sample run:
//Enter the subtotal and a gratuity rate: 10 15-> "Enter"
//The gratuity is $1.5 and total is $11.5
import java.util.Scanner;

public class S05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");

        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;

        System.out.printf("The gratuity is $%.2f and total is $%.2f\n", gratuity, total);
        input.close();
    }
}


