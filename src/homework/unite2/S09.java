package homework.unite2;

import java.util.Scanner;

//(Physics: acceleration) Average acceleration is defined as the change of velocity
//divided by the time taken to make the change, as shown in the following formula:
//a = (v1 - v0)/t
//Write a program that prompts the user to enter the starting velocity v0 in meters/second,
// the ending velocity v1 in meters/second, and the time span t in seconds, and displays the average acceleration.
// Here is a sample run:
//Enter v0, v1, and t: 5.5 50.9 4.5-> "Enter"
//The average acceleration is 10.0889
public class S09 {
    public static void main(String[] args) {
        System.out.println("Please enter the starting velocity: ");
        Scanner input = new Scanner(System.in);
        double start_velocity = input.nextDouble();
        System.out.println("Please enter the ending velocity: ");
        double end_velocity = input.nextDouble();
        System.out.println("Please enter the time: ");
        double time = input.nextDouble();
        input.close();

        double average_acceleration = (end_velocity - start_velocity) / time;

        System.out.println("The average acceleration is: " + average_acceleration);

    }
}
