package homework.unite3;
import java.util.Scanner;

//(Use the &&, || and ^ operators)
// Write a program that prompts the user to enter an integer and determines whether it is divisible by 5 and 6,
// whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both.
// Here is a sample run of this program:
// Enter an integer: 10-> "Enter"
// Is 10 divisible by 5 and 6? false
// Is 10 divisible by 5 or 6? true
// Is 10 divisible by 5 or 6, but not both? true
public class S26 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter an integer ");
        int integer = input.nextInt();
        input.close();
        boolean divisibleBy5 = integer % 5 == 0;
        boolean divisibleBy6 = integer % 6 == 0;
        System.out.println("Is " + integer + " divisible by 5 and 6? " + (divisibleBy5 && divisibleBy6));
        System.out.println("Is " + integer + " divisible by 5 or 6? " + (divisibleBy5 || divisibleBy6));
        System.out.println("Is " + integer + " divisible by 5 or 6, but not both? " + (divisibleBy5 ^ divisibleBy6));
    }
}
