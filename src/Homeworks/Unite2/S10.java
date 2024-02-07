package Homeworks.Unite2;

import java.util.Scanner;

//(Science: calculating energy)
// Write a program that calculates the energy needed to heat water from an initial temperature to a final temperature.
//Your program should prompt the user to enter the amount of water in kilograms and the initial and final temperatures of the water.
//The formula to compute the energy is Q = M * (finalTemperature – initialTemperature) * 4184
//where M is the weight of water in kilograms, temperatures are in degrees Celsius, and energy Q is measured in joules.
// Here is a sample run:
//Enter the amount of water in kilograms: 55.5-> "Enter"
//Enter the initial temperature: 3.5-> "Enter"
//Enter the final temperature: 10.5-> "Enter"
//The energy needed is 1625484.0
public class S10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms: ");
        double M = input.nextDouble();
        System.out.println("Enter the initial temperature: ");
        double İnitial_Temperature = input.nextDouble();
        System.out.println("Enter the final temperature: ");
        double Final_Temperature = input.nextDouble();
        input.close();

        double Q = M * (Final_Temperature - İnitial_Temperature) * 4184;

        System.out.println("The energy needed is " + Q);
    }
}