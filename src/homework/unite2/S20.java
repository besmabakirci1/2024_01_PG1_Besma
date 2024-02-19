package homework.unite2;
// (Financial application: calculate interest)
// If you know the balance and the annual percentage interest rate, you can compute the interest on the next monthly payment
// by using the following formula:
// interest = balance * (annualInterestRate/1200)
// Write a program that reads the balance and the annual percentage interest rate and displays the interest for the next month.
// Here is a sample run:
// Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5-> "Enter"
// The interest is 2.91667

import java.util.Scanner;

public class S20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the balance: ");
        double balance = input.nextDouble();
        System.out.println("Please enter the interest rate: ");
        double interestRate = input.nextDouble();
        input.close();

        double interest = balance * (interestRate / 1200);

        System.out.println("The intterest is: " + interest);
    }
}
