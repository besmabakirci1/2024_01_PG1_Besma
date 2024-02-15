package Homeworks.Unite2;

import java.util.Scanner;

//(Convert feet into meters)
// Write a program that reads a number in feet, converts it to meters, and displays the result.
// One foot is 0.305 meter.
// Here is a sample run:
//Enter a value for feet: 16.5-> "Enter"
// 16.5 feet is 5.0325 meters
public class S03 {
    public static void main(String[] args) {
        System.out.println("Please enter the value for feet: ");

        Scanner input = new Scanner(System.in);
        double feet = input.nextDouble();
        input.close();
        double meter= feet / 0.305;

        System.out.println("Total meter: " + meter);

    }
}
