package homework.unite5;
import java.util.Scanner;

// (Financial application: compare loans with various interest rates)
// Write a program that lets the user enter the loan amount and loan period in number of years and displays the monthly
// and total payments for each interest rate starting from 5% to 8%, with an increment of 1/8.
// Here is a sample run:
// Loan Amount: 10000-> "Enter"
// Number of Years: 5-> "Enter"

//Interest Rate         Monthly Payment         Total Payment
//5.000%                  188.71                  11322.74
//5.125%                  189.29                  11357.13
//5.250%                  189.86                  11391.59
//...
//7.875%                  202.17                  12129.97
//8.000%                  202.76                  12165.84


public class S21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the loan amount: \n " );
        int loanAmount = scanner.nextInt() ;
        System.out.print("Please enter the number of years: \n ");
        int numberOfYears = scanner.nextInt();
        System.out.println("Interest Rate \t" + "Monthly Payment \t" + "Total Payment \t");
        double monthlyPayment, totalPayment, interestRate, monthlyInterestRate;
        interestRate = 5;
        while (true) {
            monthlyInterestRate = interestRate / 1200;

            monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

            totalPayment = monthlyPayment * numberOfYears * 12;

            System.out.printf("%.3f%%\t\t\t$%.2f\t\t\t$%.2f%n", interestRate, monthlyPayment, totalPayment);

            interestRate += (double) 1 / 8;

            if (interestRate == 8.125) {
                break;
            }
        }
    }
}
// baka baka yazdım

