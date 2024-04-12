package homework.unite3;
import java.util.Scanner;

// (Science: day of the week)
// Zeller’s congruence is an algorithm developed by Christian Zeller to calculate the day of the week.
// The formula is h = ( q + (26 * (m + 1)) / 10 + k + ( k / 4) + (j / 4) + (5 * j) ) % 7
// where;
// "h" is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, 6: Friday).
// "q" is the day of the month.
// "m" is the month (3: March, 4: April, ..., 12: December).
// January and February are counted as months 13 and 14 of the previous year.
// "j" is the century (i.e., year). 100
// "k" is the year of the century (i.e., year % 100).
// Note that the division in the formula performs an integer division.
// Write a program that prompts the user to enter a year, month, and day of the month, and displays the name of the day of the week.

// Here are some sample runs:

// Enter year: (e.g., 2012): 2015-> "Enter"
// Enter month: 1-12:  1-> "Enter"
// Enter the day of the month: 1-31: 25-> "Enter"
// Day of the week is Sunday

// Enter year: (e.g., 2012): 2012-> "Enter"
// Enter month: 1-12: 5-> "Enter"
// Enter the day of the month: 1-31: 12-> "Enter"
// Day of the week is Saturday
// ( Hint: January and February are counted as 13 and 14 in the formula,
// so you need to convert the user input 1 to 13 and 2 to 14 for the month and change the year to the previous year.)
public class S21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the year: ");
        int year = input.nextInt();
        System.out.print("Please enter the month of the year: ");
        int month = input.nextInt();
        System.out.print("Please enter the day of the month: ");
        int day = input.nextInt();

        int q = day;
        int m = month;
        int j = year / 100;
        int k = year % 100;
        int h = (q + (26 * (m + 1)) / 10 + k + (k / 4) + (j / 4) + 5 * j) % 7;

        String[] dayOfWeekNames = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String dayofWeek = dayOfWeekNames[h];

        System.out.println("Day of the week is " + dayofWeek);
    }
}