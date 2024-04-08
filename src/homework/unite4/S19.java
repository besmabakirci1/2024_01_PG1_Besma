package homework.unite4;
import java.util.Scanner;

// (Business: check ISBN-10)
// Rewrite the Programming Exercise 3.9 by entering the ISBN number as a string.
public class S19 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the first 9 digit of the ISBN: ");
        String firstNineDigit = input.nextLine();
        char lastDigit = input.next().charAt(9);
        Integer.parseInt(String.valueOf(lastDigit));
        int lastDigitResult = (int) (firstNineDigit.charAt(0) + (firstNineDigit.charAt(1) * 2 ) + (firstNineDigit.charAt(2) * 3) + (firstNineDigit.charAt(3) * 4) + (firstNineDigit.charAt(4) * 5)
                + (firstNineDigit.charAt(5) * 6) + (firstNineDigit.charAt(6) * 7) + (firstNineDigit.charAt(7) * 8)+ (firstNineDigit.charAt(8) * 9) ) % 11 ;


    }
}
