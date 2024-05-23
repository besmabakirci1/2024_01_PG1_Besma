package homework.unite5;
import java.util.Scanner;

// (Display the first days of each month)
// Write a program that prompts the user to enter the year and first day of the year,
// and displays the first day of each month in the year. For example, if the user entered the year 2013,
// and 2 for Tuesday, January 1, 2013, your program should display the following output:
// January 1, 2013 is Tuesday
// ...
// December 1, 2013 is Sunday
//------------------------------
// If we use the Doomsday algorithm in this question:
// k = coefficient
// For the 1900s, Wednesday (Çarşamba): 300 + (k * 400) => 300, 700, 1100, 1500, 1900, 2300, ...
// For the 2000s, Tuesday (Salı): 0 + (k * 400) => 0, 400, 800, 1200, 1600, 2000, ...
// For the 2100s, Sunday (Pazar): 100 + (k * 400) => 100, 500, 900, 1300, 1700, 2100, ...
// For the 2200s, Friday (Cuma): 200 + (k * 400) => 200, 600, 1000, 1400, 1800, 2200, ...
// Every 400 years, Doomsdays repeat
// Doomsday special dates (31/1, 28/2, 14/3, 4/4, 9/5, 6/6, 11/7, 8/8, 5/9, 10/10, 7/11, 12/12)
// These dates always fall on the same day of the week in Doomsday algorithm.
// Solution by example:
// Please enter a full date: 25/6/2177
// Please enter the year: 2177
// For the year 2177, take the last two digits: 77, then divide by 12 to get the integer part: result: 19
// Sum the result with the number that was divided: 19 + 77 = 96
// Take the mod of 96 with 7 (week days): 96 % 7 = 5
// According to the Doomsday century rule, the Doomsday for 2100's special dates is Sunday.
// Thus, the Doomsday for 2177 is calculated as Sunday + 5 = Friday for those special dates.
// If the user entered 25/6/2177; we know that 6/6 is Friday, so we count from there to find the day of the week.
// We can adapt this solution to the problem.

public class S28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the year: ");
        int year = scanner.nextInt();
        System.out.print("Please enter the firstDay: ");
        int firstDay = scanner.nextInt();

    }
}

