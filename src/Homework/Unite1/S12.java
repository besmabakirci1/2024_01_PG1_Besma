package Homework.Unite1;
// Average Speed in Kilometers
// Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.
// Write a Java program that displays the average speed in kilometers per hour.
// (Note that 1 mile is 1.6 kilometers.)
public class S12 {
    public static void main(String[] args) {
        double mile = 24;
        double kilometer = 0.625 * mile; // if 1 mile= 1.6 kilometers so 1 kilometer= 0.625 mile.
        double totalMinutes = 60 + 40 + 0.5833; // 35/60= 0.5833
        double speedInKilometerPerHour = kilometer / (totalMinutes / 60.0);
        System.out.println("Average speed in kilometer per hour: " + speedInKilometerPerHour);
    }
}

