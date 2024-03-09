package homework.unite3;

import java.util.Scanner;

// (Game: scissor, rock, paper)
// Write a program that plays the popular scissor-rock- paper game.
// (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.)
// The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper.
// The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether
// the user or the computer wins, loses, or draws. Here are sample runs:
// Programming Exercises 111
// scissor (0), rock (1), paper (2): 1-> "Enter"
// The computer is scissor. You are rock. You won
// scissor (0), rock (1), paper (2): 2-> "Enter"
// The computer is paper. You are paper too. It is a draw
public class S17 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Please choose one of scissor (0), rock (1), paper (2) and enter as number: ");
        int answer = input.nextInt();
        int computer = (int) (Math.random() * 3);
        System.out.println("The computer: " + computer);
        input.close();

        if ( computer == answer){
            System.out.print("Draw! If you want try again :) ");
        }
        if (computer == 0 && answer == 2 ){
            System.out.print("The scissor has cut the paper, Computer won! ");
        }else if (computer == 2 && answer == 0){
            System.out.print("The scissor has cut the paper, You won! ");
        }
        if (computer == 1 && answer == 0){
            System.out.print(" The rock has knocked the scissor, Computer won! ");
        } else if (computer == 0 && answer == 1) {
            System.out.print("The rock has knocked the scissor, You won! ");
        }
        if (computer == 2 && answer == 1){
            System.out.print("The paper has wrapt the rock, Computer won!");
        } else if (computer == 1 && answer == 2 ) {
            System.out.print("The paper has wrapt the rock, You won!");
        }
    }
}
