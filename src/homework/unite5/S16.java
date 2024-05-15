package homework.unite5;
import java.util.Scanner;

// (Find the factors of an integer)
// Write a program that reads an integer and displays all its smallest factors in increasing order.
// For example, if the input integer is 120, the output should be as follows: 2, 2, 2, 3, 5.
public class S16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int number = scanner.nextInt();
        for( int i = 2 ; i <= number ; i++){
            while (number % i == 0){
                System.out.print(i + "," + " " );
                number /= i;
                if(number % i != 0){
                    break;
                }
            }
        }
    }
}
