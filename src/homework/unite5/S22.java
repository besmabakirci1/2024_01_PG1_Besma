package homework.unite5;
import java.util.Scanner;

// (Financial application: loan amortization schedule)
// The monthly payment for a given loan pays the principal and the interest.
// The monthly interest is computed by multiplying the monthly interest rate and the balance
// (the remaining principal).
// The principal paid for the month is therefore the monthly payment minus the monthly interest.
// Write a program that lets the user enter the loan amount,number of years, and interest rate and
// displays the amortization schedule for the loan.
// Here is a sample run:
// Loan Amount: 10000-> "Enter"
// Number of Years: 1-> "Enter"
// Annual Interest Rate: 7-> "Enter"

// Monthly Payment: 865.26
// Total Payment: 10383.21

// Payment     Interest         Principal      Balance
// 1            58.33            806.93         9193.07
// 2            53.62            811.64         8381.43
// ...
// 11           10.0             855.26          860.27
// 12            5.01            860.25            0.01

// Note : The balance after the last payment may not be zero. If so, the last payment should be the normal monthly payment plus the final balance.
// Hint: Write a loop to display the table. Since the monthly payment is the same for each month, it should be computed before the loop.
// The balance is initially the loan amount.
// For each iteration in the loop, compute the interest and principal, and update the balance.
// The loop may look like this:
// for (i = 1; i <= numberOfYears * 12; i++) {
// interest = monthlyInterestRate * balance;
// principal = monthlyPayment - interest;
// balance = balance - principal;
// System.out.println(i + "\t\t" + interest
//  + "\t\t" + principal + "\t\t" + balance);
//  }

public class S22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the loan amount: "); // loan amount == kredi miktarı
        double loanAmount = scanner.nextDouble();
        System.out.print("Please enter the number of years: "); // kredi alacağı yıl sayısını girsin
        int numberOfYear = scanner.nextInt();
        System.out.println("Please enter the annual interest rate");
        double annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int totalMonths = numberOfYear * 12;

        double interest, balance = 0, monthlyPayment = 0, principal = 0;
        for (int i = 0; i < numberOfYear * 12; i++) {
            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
        }
    }
}
// ANLAMADIM!::::