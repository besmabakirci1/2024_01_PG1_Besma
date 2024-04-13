package homework.unite5;
import java.util.Scanner;

// (Conversion from kilograms to pounds)
// Write a program that displays the following table (note that 1 kilogram is 2.2 pounds):
// Kilograms       Pounds
//  1               2.2
//  3               6.6
// ...
// 197              433.4
// 199              437.8


public class S03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the kilogram amount to conversion kg to pounds: ");
        int kilogram = input.nextInt();
        double pound = kilogram * 2.2;
        System.out.printf("The conversion result is: %.1f" , pound);
    }
}
