package Homeworks.Unite2;

import java.util.Scanner;

//(Cost of driving)
// Write a program that prompts the user to enter the distance to drive, the fuel efficiency of the car in miles per gallon,
// and the price per gallon, and displays the cost of the trip.
// Here is a sample run:
//Enter the driving distance: 900.5-> "Enter"
//Enter miles per gallon: 25.5-> "Enter"
//Enter price per gallon: 3.55-> "Enter"
//The cost of driving is $125.36
public class S23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.print("Please enter the miles per gallon: ");
        double miles = input.nextDouble();
        System.out.print("Please enter the price per gallon: ");
        double price = input.nextDouble();
        input.close();

        double cost = (distance / miles) * price;

        System.out.println("The cost of driving is: " + cost);
    }
}
