package homework.unite5;
import java.util.Scanner;

// (Longest common prefix)
// Write a program that prompts the user to enter two strings and displays the largest common prefix of
// the two strings.
// Here are some sample runs:
// Enter the first string: Welcome to C++
// Enter the second string: Welcome to programming
// The common prefix is Welcome to
// Enter the first string: Atlanta
// Enter the second string: Macon
// Atlanta and Macon have no common prefix
public class S51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first String: ");
        String firstString = scanner.nextLine();
        System.out.println("Please enter the second String: ");
        String secondString = scanner.nextLine();
        scanner.close();



    }
}
