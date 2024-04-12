package homework.unite3;
import java.util.Scanner;

// (Financials: currency exchange)
// Write a program that prompts the user to enter the exchange rate from currency in U.S. dollars to Chinese RMB.
// Prompt the user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from Chinese RMB and U.S. dollars.
// Prompt the user to enter the amount in U.S. dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.

// Here are the sample runs:
// Enter the exchange rate from dollars to RMB: 6.81-> "Enter"
// Enter 0 to convert dollars to RMB and 1 vice versa: 0-> "Enter"
// Enter the dollar amount:  100-> "Enter"
// $100.0 is 681.0 yuan

// Enter the exchange rate from dollars to RMB: 6.81-> "Enter"
// Enter 0 to convert dollars to RMB and 1 vice versa: 5-> "Enter"
// Enter the RMB amount:  10000-> "Enter"
// 10000.0 yuan is $1468.43

// Enter the exchange rate from dollars to RMB: 6.81-> "Enter"
// Enter 0 to convert dollars to RMB and 1 vice versa: 5-> "Enter"
// Incorrect input
public class S31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 0 to convert USD to RMB, 1 for RMB to USD: ");
        int exchangeRate = input.nextInt();

        if (exchangeRate == 0  ){
            System.out.println("Please enter the amount rate in dollars: ");
            double rateDollar = input.nextDouble();
            double totalRBM =  rateDollar * exchangeRate;
            System.out.println(rateDollar + " is " + totalRBM + "yuan");
        }else if (exchangeRate == 1){
            System.out.println("Please enter the amount rate in RMB: ");
            double rateRBM = input.nextDouble();
            double totalDollar =  rateRBM / exchangeRate;
            System.out.println(rateRBM + " is " + totalDollar + "dollar");
        }else{
            System.out.println("Incorrect input");
        }
    }
}
