package homework.unite5;

// (Display leap years)
// Write a program that displays all the leap years, ten per line, from 101 to 2100, separated by exactly one space.
// Also display the number of leap years in this period.
public class S27 {
    public static void main(String[] args) {
        System.out.println("This program will display all the leap year then per line from 101 to 2100: ");
        int count = 0;
        for (int year = 101; year <= 2100; year++ ){
            if((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0 )){
                count ++;
                System.out.print(year + " ");
                if (count % 10 == 0 ){
                    System.out.println();
                }
            }
        }
    }
}
