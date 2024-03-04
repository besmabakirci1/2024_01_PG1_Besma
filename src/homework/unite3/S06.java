package homework.unite3;

import java.util.Scanner;

// (Health application: BMI)
// Revise Listing 3.4, ComputeAndInterpretBMI.java, to let the user enter weight, feet, and inches.
// For example, if a person is 5 feet and 10 inches, you will enter 5 for feet and 10 for inches.
// Here is a sample run:
// Enter weight in pounds: 140 -> "Enter"
// Enter feet: 5 -> "Enter"
// Enter inches: 10 -> "Enter"
// BMI is 20.087702275404553
// Normal
public class S06 {

    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        double totalInches = feet * 12 + inches;
        double heightInMeters = totalInches * METERS_PER_INCH;
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.println("BMI is " +bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("'Overweight");
        else
            System.out.println("Obese");
    }
}
