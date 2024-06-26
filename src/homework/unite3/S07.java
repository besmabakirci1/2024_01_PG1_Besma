package homework.unite3;
import java.util.Scanner;

// (Financial application: monetary units)
// Modify Listing 2.10, ComputeChange .java,
// to display the nonzero denominations only, using singular words for single units such as 1 dollar and 1 penny,
// and plural words for more than one unit such as 2 dollars and 3 pennies.

public class S07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");

        if (numberOfOneDollars != 0)
            System.out.println(" " + numberOfOneDollars + (numberOfOneDollars == 1 ? " dollar" : " dollars"));
        if (numberOfQuarters != 0)
            System.out.println(" " + numberOfQuarters + (numberOfQuarters == 1 ? " quarter" : " quarters"));
        if (numberOfDimes != 0)
        if (numberOfDimes != 0)
            System.out.println(" " + numberOfDimes + (numberOfDimes == 1 ? " dime" : " dimes"));
        if (numberOfNickels != 0)
            System.out.println(" " + numberOfNickels + (numberOfNickels == 1 ? " nickel" : " nickels"));
        if (numberOfPennies != 0)
            System.out.println(" " + numberOfPennies + (numberOfPennies == 1 ? " penny" : " pennies"));
    }
}
