package homework.unite4;
import java.util.Scanner;

//(Process a string)
// Write a program that prompts the user to enter a string and displays its length and its first character.
public class S20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String userInput = input.nextLine();

        System.out.println("Length of the string: " + userInput.length());
        System.out.println("First character of the string: " + userInput.charAt(0));
    }
}
