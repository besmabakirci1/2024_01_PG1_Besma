package homework.unite5;
import java.util.Scanner;

// (Financial application: compute CD value)
// Suppose you put $10,000 into a CD with an annual percentage yield of 5.75%.
// After one month, the CD is worth
// 10000 + 10000 * 5.75 / 1200 = 10047.92
// After two months, the CD is worth
// 10047.91 + 10047.91 * 5.75 / 1200 = 10096.06
// After three months, the CD is worth
// 10096.06 + 10096.06 * 5.75 / 1200 = 10144.44 and so on.
// Write a program that prompts the user to enter an amount (e.g., 10000), the annual percentage yield (e.g., 5.75),
// and the number of months (e.g., 18) and displays a table as shown in the sample run.
// Enter the initial deposit amount: 10000-> "Enter"
// Enter annual percentage yield: 5.75-> "Enter"
// Enter maturity period (number of months): 18-> "Enter"

import java.util.Scanner;

// Month     CD Value
//  1        10047.92
//  2        10096.06
//  ...
//  17       10846.57
//  18       10898.54
public class S31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the save amount: ");
        double saveAmount = scanner.nextDouble();

        System.out.print("Please enter the annual interest: ");
        double annualInterest = scanner.nextDouble();

        System.out.print("Please enter the number of months: ");
        int numberOfMonth = scanner.nextInt();

        double interestRateMonthly = annualInterest / 1200;
        System.out.println("Month\tCD Value");

        double futureSavingAccount = saveAmount;

        for (int month = 1; month <= numberOfMonth; month++) {
            futureSavingAccount += futureSavingAccount * interestRateMonthly;
            System.out.printf("%-8d%.2f\n", month, futureSavingAccount);
        }
    }
}
