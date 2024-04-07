package homework.unite4;
import java.util.Scanner;

// Vowel or consonant?
// Write a program that prompts the user to enter a letter and check whether the letter is a vowel or consonant.
// Here is a sample run:
// Enter a letter: B-> "Enter"
// B is a consonant
// Enter a letter grade: a-> "Enter"
// 'a' is a vowel
// Enter a letter grade: #-> "Enter"
// # is an invalid input
public class S13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter: ");
        String userInput = input.next();

        char letter = userInput.charAt(0);

        if (!Character.isLetter(letter)) {
            System.out.println(letter + " is an invalid input");
            System.exit(1);
        } else {
            letter = Character.toLowerCase(letter);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println("'" + letter + "' is a vowel");
            } else {
                System.out.println("'" + letter + "' is a consonant");
            }
        }
    }
}
