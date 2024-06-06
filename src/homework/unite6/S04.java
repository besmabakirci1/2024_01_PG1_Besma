package homework.unite6;
import java.util.Scanner;

// (Display an integer reversed)
// Write a method with the following header to display an integer in reverse order:
// public static void reverse(int number)
// For example, reverse(3456) displays 6543. Write a test program that prompts
// the user to enter an integer and displays its reversal.
public class S04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer to reverse it: ");
        int number = scanner.nextInt();
        reverse(number);
    }

    public static void reverse(int number) {
        String numberOrder = Integer.toString(number);
        for (int i = numberOrder.length() - 1; i >= 0; i--) {
            System.out.print(numberOrder.charAt(i));
        }
        System.out.println();
    }
}
