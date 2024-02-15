package Homeworks.Unite2;

import java.util.Scanner;

//(Find the number of years)
// Write a program that prompts the user to enter the minutes (e.g., 1 billion),
// and displays the number of years and days for the minutes.
// For simplicity, assume a year has 365 days. Here is a sample run:
//Enter the number of minutes: 1000000000-> "Enter"
//1000000000 minutes is approximately 1902 years and 214 days
public class S07 {
    public static void main(String[] args) {
        System.out.print("Please enter the minutes that will prompt to years, days and minutes: ");
        Scanner input = new Scanner(System.in);
        int minutes = input.nextInt();
        input.close();

        int days = minutes/ (24 * 60) ;
        int years = days/365 ;
        days = days % 365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
