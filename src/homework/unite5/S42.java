package homework.unite5;

// (Financial application: find the sales amount) Rewrite Programming Exercise 5.39 as follows:
// Use a for loop instead of a do-while loop.
// Let the user enter COMMISSION_SOUGHT instead of fixing it as a constant.
// ---------------------------------------------------------------------------------
// You have just started a sales job in a department store. Your pay consists of a base salary and a commission.
// The base salary is $5,000.
// The scheme shown below is used to determine the commission rate.
//    Sales Amount                 Commission Rate
// -----------------------------------------------------
//   $0.01–$5,000                     8 percent
//   $5,000.01–$10,000               10 percent
//   $10,000.01 and above            12 percent
// Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the next $5000 is at 10%,
// and the rest is at 12%.
// If the sales amount is 25,000, the commission is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.
// Your goal is to earn $30,000 a year.
// Write a program that finds the minimum sales you have to generate in order to make $30,000.

import java.util.Scanner;

public class S42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the commission sought: ");
        double commissionSought = scanner.nextDouble();


        final double baseSalary = 5000.0;
        final double commissionRate1 = 0.08;
        final double commissionRate2 = 0.10;
        final double commissionRate3 = 0.12;

        double salesAmount = 0.01;
        double commission;
        do {
            commission = 0.0;
            double firstTierSales = Math.min(salesAmount, 5000);
            commission += firstTierSales * commissionRate1;
            if (salesAmount > 5000) {
                double secondTierSales = Math.min(salesAmount - 5000, 5000);
                commission += secondTierSales * commissionRate2;
            }

            if (salesAmount > 10000) {
                double thirdTierSales = salesAmount - 10000;
                commission += thirdTierSales * commissionRate3;
            }

            salesAmount += 0.01;

        } while (commission + baseSalary < commissionSought);

        System.out.printf("Minimum sales to earn $%.0f: $%.2f\n", commissionSought, salesAmount);
    }
}
// bir daha çözmekte fayda var.