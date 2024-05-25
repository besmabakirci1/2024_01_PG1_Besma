package homework.unite5;
import java.util.Scanner;

// (Game: scissor, rock, paper)
// Programming Exercise 3.17 gives a program that plays the scissor-rock-paper game.
// Revise the program to let the user continuously play until either the user or the computer wins more than two times than its opponent.
public class S34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countComputer = 0;
        int countAnswer = 0;

        while (countComputer < 2 && countAnswer < 2) {
            System.out.print("Please choose one of scissor (0), rock (1), paper (2) and enter as number: ");
            int answer = input.nextInt();
            int computer = (int) (Math.random() * 3);

            if (answer < 0 || answer > 2) {
                System.out.println("Invalid choice. Please enter a number between 0 and 2.");
                continue;
            }

            System.out.println("The computer: " + computer);

            if (computer == answer) {
                System.out.println("Draw! If you want try again :)");
            } else if ((computer == 0 && answer == 2) || (computer == 1 && answer == 0) || (computer == 2 && answer == 1)) {
                System.out.println("Computer won!");
                countComputer++;
            } else {
                System.out.println("You won!");
                countAnswer++;
            }
        }

        input.close();
    }
}
