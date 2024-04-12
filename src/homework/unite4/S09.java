package homework.unite4;
import java.util.Scanner;

//(Find the Unicode of a character)
// Write a program that receives a character and displays its Unicode.
// Here is a sample run:
// Enter a character: E-> "Enter"
// The Unicode for the character E is 69
public class S09 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the character: ");
        char ch = input.next().charAt(0);

        int unicodeValue = ch;

        System.out.println("The Unicode for the character '" + ch + "' is " + unicodeValue);
    }
}
