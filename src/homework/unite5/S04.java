package homework.unite5;
import java.util.Scanner;

// (Conversion from miles to kilometers)
// Write a program that displays the following table (note that 1 mile is 1.609 kilometers):
// Miles       Kilometers
// 1             1.609
// 2             3.218
// ...
// 9             14.481
// 10            16.090
public class S04 {
    public static void main(String[] args) {
        System.out.println("Miles \t Kilometers");
        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = miles * 1.609;
            System.out.printf("%-12d%.3f\n", miles, kilometers);
        }
    }
}

