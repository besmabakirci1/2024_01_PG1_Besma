package homework.unite6;
import java.util.Scanner;

//( Display patterns) Write a method to display a pattern as follows:
//               1
//             2 1
//           3 2 1
//             ...
// n n-1 ... 3 2 1
// The method header is
// public static void displayPattern(int n)
public class S06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter n to display pattern: ");
        int n = scanner.nextInt();
        displayPattern(n);
    }

    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
