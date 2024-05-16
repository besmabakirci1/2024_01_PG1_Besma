package homework.unite5;
import java.util.Scanner;

// (Display pyramid)
// Write a program that prompts the user to enter an integer from 1 to 15 and displays a pyramid,
// as shown in the following sample run:
// Enter the number of lines: 7
//                   1
//                2  1  2
//             3  2  1  2  3
//          4  3  2  1  2  3  4
//       5  4  3  2  1  2  3  4  5
//    6  5  4  3  2  1  2  3  4  5  6
// 7  6  5  4  3  2  1  2  3  4  5  6  7
public class S17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line;
        do {
            System.out.print("Please enter a number from 1 to 15 to display lines: ");
            line = scanner.nextInt();
        }
        while (line < 1 || line > 15);
            for (int i = 1; i <= line ; i++){
                for (int j = 0; j < line - i; j++) {
                    System.out.print("   ");
                }

                for (int j = i; j >= 1; j--) {
                    System.out.printf("%2d ", j);
                }

                for (int j = 2; j <= i; j++) {
                    System.out.printf("%2d ", j);
                }
                System.out.println();
            }
        }
    }

// kendim yazamadım for kısmını :/