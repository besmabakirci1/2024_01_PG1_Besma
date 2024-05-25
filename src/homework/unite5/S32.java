package homework.unite5;
import java.util.Scanner;

// (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a two-digit number.
// The two digits in the number are distinct.
// (Hint: Generate the first digit. Use a loop to continuously generate the second digit until it is different from the first digit.)
public class S32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess;

        while (true) {
            System.out.print("Enter your lottery pick (two digits): ");
            guess = input.nextInt();
            if (guess >= 10 && guess <= 99) {
                break;
            }
            System.out.println("Please enter a two-digit number.");
        }

        int lotteryDigit1 = (int)(Math.random() * 10);
        int lotteryDigit2;

        do {
            lotteryDigit2 = (int)(Math.random() * 10);
        } while (lotteryDigit2 == lotteryDigit1);

        int lottery = lotteryDigit1 * 10 + lotteryDigit2;

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        if (guess == lottery) {
            System.out.println("Exact match: you win $10,000");
        }
        else if ((guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2) ||
                (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1)) {
            System.out.println("Match all digits: you win $3,000");
        }
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2) {
            System.out.println("Match one digit in the first place: you win $1,000");
        }
        else if (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2) {
            System.out.println("Match one digit in the second place: you win $1,000");
        }
        else {
            System.out.println("Sorry, no match");
        }
    }
}

