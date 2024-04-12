package homework.unite4;
import java.util.Scanner;

// (Days of a month)
// Write a program that prompts the user to enter a year and the first three letters of a month name
// (with the first letter in uppercase) and displays the number of days in the month.

// Here is a sample run:
// Enter a year: 2001-> "Enter"
// Enter a month: Jan-> "Enter"
// Jan 2001 has 31 days

//Enter a year: 2016-> "Enter"
//Enter a month: Feb-> "Enter"
//Jan 2016 has 29 days

public class S17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the year: ");
        int year = input.nextInt();
        System.out.println("Please enter the first three letters of the month: ");
        String monthInput = input.next().toUpperCase();

        if (monthInput.length() == 3) {
            String formattedInput = monthInput.substring(0, 1).toUpperCase() + monthInput.substring(1).toLowerCase();
            int days = 0;

            switch (formattedInput) {
                case "JAN" , "Jan" , "jan" :
                case "MAR" , "Mar" , "mar" :
                case "MAY" , "May" , "may" :
                case "JUL" , "Jul" , "jul" :
                case "AUG" , "Aug" , "aug" :
                case "OCT" , "Oct" , "oct" :
                case "DEC" , "Dec" , "dec" :
                    days = 31;
                    break;
                case "APR" , "Apr" , "apr" :
                case "JUN" , "Jun" , "jun" :
                case "SEP" , "Sep" , "sep" :
                case "NOV" , "Nov" , "nov" :
                    days = 30;
                    break;
                case "FEB" , "Feb" , "feb" :
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                default:
                    System.out.println("Invalid month entered.");
                    return;
            }

            System.out.println(formattedInput + " " + year + " has " + days + " days.");
        } else {
            System.out.println("Please enter exactly three characters for the month.");
        }
    }
}

