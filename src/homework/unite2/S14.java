package homework.unite2;

import java.util.Scanner;

// (Health application: computing BMI)
// Body Mass Index (BMI) is a measure of health on weight.
// It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters.
// Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI.
// Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
// Here is a sample run:
// Enter weight in pounds: 95.5-> "Enter"
// Enter height in inches: 50-> "Enter"
// BMI is 26.8573
public class S14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the weight in pound: " );
        double weight_in_pound  = input.nextDouble();
        System.out.print("Please enter the weight in inches: " );
        double height_in_inches = input.nextDouble();
        input.close();

        double kilogram = weight_in_pound * 0.45359237 ;
        double meter = height_in_inches * 0.0254;
        double BMI = kilogram / (meter * meter);

        System.out.println("BMI is: " + BMI);
    }
}
