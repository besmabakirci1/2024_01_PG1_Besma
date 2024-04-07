package homework.unite4;
import java.util.Scanner;

// (Hex to binary)
// Write a program that prompts the user to enter a hex digit and displays its corresponding binary number.
// Here is a sample run:
// Enter a hex digit: B-> "Enter"
// The binary value is 1011
// Enter a hex digit: G-> "Enter"
// G is an invalid input
public class S12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a hex digit: ");
        char hexDigit = input.next().charAt(0);
        input.close();
        String binary;

        if ( (hexDigit >= '0' && hexDigit <= '9') || (hexDigit >= 'A' && hexDigit <= 'F') ){
            switch (hexDigit){
                case '0':
                    binary = "0000";
                    break;
                case '1':
                    binary = "0001";
                    break;
                case '2':
                    binary = "0010";
                    break;
                case '3':
                    binary = "0011";
                    break;
                case '4':
                    binary = "0100";
                    break;
                case '5':
                    binary = "0101";
                    break;
                case '6':
                    binary = "0110";
                    break;
                case '7':
                    binary = "0111";
                    break;
                case '8':
                    binary = "1000";
                    break;
                case '9':
                    binary = "1001";
                    break;
                case 'A':
                    binary = "1010";
                    break;
                case 'B':
                    binary = "1011";
                    break;
                case 'C':
                    binary = "1100";
                    break;
                case 'D':
                    binary = "1101";
                    break;
                case 'E':
                    binary = "1110";
                    break;
                case 'F':
                    binary = "1111";
                    break;
                default:
                    binary = "";
            }
            System.out.println("The binary value is " + binary);
        } else {
            System.out.println(hexDigit + " is an invalid input");
        }
    }
}
