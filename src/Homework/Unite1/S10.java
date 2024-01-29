package Homework.Unite1;
//(Average speed in miles)
// Assume a runner runs 14 kilometers in 45 minutes and 30 seconds.
// Write a program that displays the average speed in miles per hour. (Note that 1 mile is 1.6 kilometers.)
public class S10 {
    public static void main(String[] args) {
        double kilometer = 14.0;
        double mile = 1.6 * kilometer;
        double totalMinutes = 45.5;
        double speedInMilesPerHour = mile / (totalMinutes / 60.0);
        System.out.println("Average speed in miles per hour: " + speedInMilesPerHour);
    }
}
