package homework.unite3;
import java.util.Scanner;

// (Game: heads or tails)
// Write a program that lets the user guess whether the flip of a coin results in heads or tails.
// The program randomly generates an integer 0 or 1, which represents head or tail.
// The program prompts the user to enter a guess and reports whether the guess is correct or incorrect.
public class S14 {
    public static void main(String[] args) {
        System.out.println("Please enter your guess (0 for heads, 1 for tail ): ");
        Scanner input = new Scanner(System.in);
        int userGuess = input.nextInt();

        int randomNumber = (int) (Math.random() * 2);

        if (userGuess == randomNumber){
            System.out.println("Correct!");
        }
        else{
            System.out.println("Try Again!");
        }
        if (randomNumber == 1){
            System.out.println("The coin flip resulted in tails.");
        }
        else {
            System.out.println("The coin flip resulted in heads.");
        }
    }
}
