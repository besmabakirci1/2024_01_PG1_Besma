package homework.unite4;
import java.util.Scanner;

// (Decimal to hex)
// Write a program that prompts the user to enter an integer between 0 and 15 and displays its corresponding hex number.
// Here are some sample runs:
// Enter a decimal value (0 to 15): 11-> "Enter"
// The hex value is B
// Enter a decimal value (0 to 15): 5-> "Enter"
// The hex value is 5
// Enter a decimal value (0 to 15): 31-> "Enter"
// 31 is an invalid input
public class S11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer between 0 and 15: ");
        int decimalValue = input.nextInt();
        input.close();

        String hexValue;
        if (decimalValue >= 0 && decimalValue <= 15){
            switch (decimalValue) {
                case 10:
                    hexValue = "A";
                    break;
                case 11:
                    hexValue = "B";
                    break;
                case 12:
                    hexValue = "C";
                    break;
                case 13:
                    hexValue = "D";
                    break;
                case 14:
                    hexValue = "E";
                    break;
                case 15:
                    hexValue = "F";
                    break;
                default:
                    hexValue = Integer.toString(decimalValue); // For 0-9, decimal and hex values are the same
            }
                System.out.println("The hex value is " + hexValue);

            } else {
                System.out.println(decimalValue + " is an invalid input");
            }
    }
}
