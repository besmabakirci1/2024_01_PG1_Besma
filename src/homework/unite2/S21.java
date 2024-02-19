package homework.unite2;

//(Financial application: calculate future investment value)
// Write a program that reads in investment amount, annual interest rate, and number of years,
// and displays the future investment value using the following formula:
//futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears*12)
//For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1,
// the future investment value is 1032.98.
//Here is a sample run:
//Enter investment amount: 1000.56-> "Enter"
//Enter annual interest rate in percentage: 4.25-> "Enter"
//Enter number of years: 1-> "Enter"
//Accumulated value is $1043.92
import java.util.Scanner;

public class S21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the investment amount: ");
        double investAmount = input.nextDouble();
        System.out.println("Please enter the annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();
        System.out.println("Please enter the number of years: ");
        int number_of_years = input.nextInt();
        input.close();

        double monthly_interest_rate = annualInterestRate / 100 / 12;
        double futureInvestmentValue = investAmount * Math.pow((1 + monthly_interest_rate), (number_of_years * 12));

        System.out.printf("Accumulated value is $%.2f%n", futureInvestmentValue);
    }
}
