package homework.unite4;
import java.util.Scanner;

// (Find the character of an ASCII code)
// Write a program that receives an ASCII code (an integer between 0 and 127) and displays its character.
// Here is a sample run:
// Enter an ASCII code: 69-> "Enter"
// The character for ASCII code 69 is E
public class S08 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter an ASCII code: ");
        int ASCII = input.nextInt();
        input.close();
        System.out.printf("The character for ASCII code",ASCII, "is " );
//devam edilecek.
    }
}
