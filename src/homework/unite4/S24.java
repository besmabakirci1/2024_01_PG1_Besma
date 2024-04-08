package homework.unite4;
import java.util.Scanner;

// (Order three cities)
// Write a program that prompts the user to enter three cities and displays them in ascending order.
// Here is a sample run:
// Enter the first city: Chicago-> "Enter"
// Enter the second city: Los Angeles-> "Enter"
// Enter the third city: Atlanta-> "Enter"
// The three cities in alphabetical order are Atlanta Chicago Los Angeles
public class S24 {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first city: ");
        String city1 = input.nextLine();
        System.out.println("Please enter the second city: ");
        String city2 = input.nextLine();
        System.out.println("Please enter the third city: ");
        String city3 = input.nextLine();
        String result = "";
        if (city1.compareToIgnoreCase(city2) < 0 && city1.compareToIgnoreCase(city3) < 0) {
            result = city1.compareToIgnoreCase((city3 ) < 0) ?
                    "The three cities in alphabetical order are " + city1 + " " + city2 + " " + city3 :
                    "The three cities in alphabetical order are " + city1 + " " + city3 + " " + city2;
        }*/
        Scanner scan = new Scanner(System.in);

        String first_city, second_city, third_city, result = "";

        System.out.print("Enter the first city: ");
        first_city = scan.nextLine();

        System.out.print("Enter the second city: ");
        second_city = scan.nextLine();

        System.out.print("Enter the third city: ");
        third_city = scan.nextLine();

        // Chicago,  Los Angeles, Atlanta
        if (first_city.compareToIgnoreCase(second_city) < 0 && first_city.compareToIgnoreCase(third_city) < 0) {
            result = (second_city.compareToIgnoreCase(third_city) < 0) ?
                    "The three cities in alphabetical order are " + first_city + " " + second_city + " " + third_city :
                    "The three cities in alphabetical order are " + first_city + " " + third_city + " " + second_city;

        } else if (second_city.compareToIgnoreCase(first_city) < 0 && second_city.compareToIgnoreCase(third_city) < 0) {
            result = (first_city.compareToIgnoreCase(third_city) < 0) ?
                    "The three cities in alphabetical order are " + second_city + " " + first_city + " " + third_city :
                    "The three cities in alphabetical order are " + second_city + " " + third_city + " " + first_city;
        } else {
            if (third_city.compareToIgnoreCase(first_city) < 0) {
                result = (first_city.compareToIgnoreCase(second_city) < 0) ?
                        "The three cities in alphabetical order are " + third_city + " " + first_city + " " + second_city :
                        "The three cities in alphabetical order are " + third_city + " " + second_city + " " + first_city;
            }
        }

        System.out.println(result);
    }
}
