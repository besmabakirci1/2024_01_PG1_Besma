package homework.unite5;
import java.util.Scanner;

// (Occurrence of max numbers) / Occurrence : tekrarlanması
// Write a program that reads integers, finds the largest of them, and counts its occurrences.
// Assume that the input ends with number 0.
// Suppose that you entered 3 5 2 5 5 5 0;
// the program finds that the largest is 5 and the occurrence count for 5 is 4.
// (Hint: Maintain two variables, max and count.
// max stores the current max number, and count stores its occurrences.
// Initially, assign the first number to max and 1 to count.
// Compare each subsequent number with max.
// If the number is greater than max, assign it to max and reset count to 1.
// If the number is equal to max, increment count by 1.)
public class S41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter integers: ");
        int max = Integer.MIN_VALUE;
        while (true){
            int num = scanner.nextInt();

        }
    }
}

