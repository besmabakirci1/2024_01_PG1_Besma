package Homeworks.Unite2;

import java.util.Scanner;

//(Convert Celsius to Fahrenheit)
//Write a program that reads a Celsius degree in a double value from the console,
// then converts it to Fahrenheit and displays the result.
// The formula for the conversion is as follows:
//Fahrenheit = (9 / 5) * celsius + 32
//Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
//Here is a sample run:
// Enter a degree in Celsius: 43-> "Enter"
//43 Celsius is 109.4 Fahrenheit

import java.util.Scanner;
public class S01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the celsius value: ");
        double Celsius = input.nextDouble();
        input.close();
        double Fahrenheit = (9.0 / 5) * Celsius + 32;

        System.out.println("Celsius: " + Celsius );
        System.out.println("Fahrenheit: " + Fahrenheit);

    }
}

