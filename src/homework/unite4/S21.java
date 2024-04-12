package homework.unite4;
import java.util.Scanner;
import static java.lang.Character.isDigit;

//(Check SSN)
// Write a program that prompts the user to enter a Social Security number in the format DDD-DD-DDDD,
// where D is a digit.Your program should check whether the input is valid.
// Here are sample runs:
//Enter a SSN: 232-23-5435
//232-23-5435 is a valid social security number
//Enter a SSN: 23-23-5435
//23-23-5435 is an invalid social security number
public class S21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the SSN (in the format DDD-DD-DDDD): ");
        String ssn = input.nextLine();


        if (ssn.length() == 11 && ssn.charAt(3) == '-' && ssn.charAt(6) == '-'){
            String part1 = ssn.substring(0, 3);
            String part2 = ssn.substring(4, 6);
            String part3 = ssn.substring(7, 11);

            if (isDigit(part1.charAt(0)) && isDigit(part1.charAt(1)) && isDigit(part1.charAt(2)) &&
                    isDigit(part2.charAt(0)) && isDigit(part2.charAt(1)) &&
                    isDigit(part3.charAt(0)) && isDigit(part3.charAt(1)) &&
                    isDigit(part3.charAt(2)) && isDigit(part3.charAt(3))) {
                System.out.println(ssn + " is a valid social security number");
            } else {
                System.out.println(ssn + " is an invalid social security number");
            }
        }else {
            System.out.println(ssn + " is not in the correct format (DDD-DD-DDDD)");
        }
    }
}
