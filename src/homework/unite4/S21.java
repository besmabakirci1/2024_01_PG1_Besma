package homework.unite4;
import java.util.Scanner;

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
        String digit = input.nextLine();

    }
}
