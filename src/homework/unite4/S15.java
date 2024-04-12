package homework.unite4;
import java.util.Scanner;

//(Phone key pads)
// The international standard letter/number mapping found on the telephone is shown below:
// 1           2 (A B C)   3(D E F)
// 4(G H I)    5(J K L)    6(M N O)
// 7(P R Q S)  8(T U V)    9(W X Y Z)
// *           0           #

// Write a program that prompts the user to enter a letter and displays its corresponding number.
// Enter a letter: A-> "Enter"
// The corresponding number is 2
// Enter a letter: a-> "Enter"
// The corresponding number is 2
// Enter a letter: + -> "Enter"
// + is an invalid input
public class S15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter: ");
        String userInput = input.next();

        char letter = userInput.toUpperCase().charAt(0);
        int numericValue = 0;

        if (!Character.isLetter(letter)){
            System.out.println(letter + " is an invalid input");
        } else if (Character.isLetter(letter)) {
            switch (letter){
                case '1':
                    numericValue = 1;
                    break;
                case 'A':
                case 'B':
                case 'C':
                    numericValue = 2;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    numericValue = 3;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    numericValue = 4;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    numericValue = 5;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    numericValue = 6;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    numericValue = 7;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    numericValue = 8;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    numericValue = 9;
                    break;
            }
            System.out.println("The corresponding number is " + numericValue);
        }
    }
}
