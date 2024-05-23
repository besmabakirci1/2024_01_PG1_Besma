package homework.unite5;
import java.util.Scanner;

// (Financial application: compound value)
// Suppose you save $100 each month into a savings account with the annual interest rate 5%.
// So, the monthly interest rate is 0.05 / 12 = 0.00417. After the first month, the value in the account becomes
//  100 * (1 + 0.00417) = 100.417
// After the second month, the value in the account becomes
//  (100 + 100.417) * (1 + 0.00417) = 201.252
// After the third month, the value in the account becomes
//  (100 + 201.252) * (1 + 0.00417) = 302.507 and so on.
// Write a program that prompts the user to enter an amount (e.g., 100), the annual interest rate (e.g., 5),
// and the number of months (e.g., 6) and displays the amount in the savings account after the given month.
// --------------
// solution way :
// future saving amount =
public class S30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the save amount: ");
        int saveAmount = scanner.nextInt();
        System.out.print("Please enter the annual interest: ");
        double interest = scanner.nextDouble();
        System.out.print("Please enter the number of months: ");
        int numberOfMonth = scanner.nextInt();

        double interestRateMonthly = interest / 1200;
///      double futureSavingAccount = saveAmount * (double) ((Math.pow((1 + interestRateMonthly ),numberOfMonth) - 1 ) / interestRateMonthly);
///      System.out.println("The account:  " + futureSavingAccount);

        double futureSavingAccount = 0;
        for (int i = 0; i < numberOfMonth; i++) {
            futureSavingAccount = (futureSavingAccount + saveAmount) * (1 + interestRateMonthly);
        }
        System.out.printf("The account balance after %d months is: %.2f\n", numberOfMonth, futureSavingAccount);
    }
}

/// ben bu şekilde yazdım ve  hesaplamalarda çok küçük bir farklılık oluyor.nedenini anlamadım.
