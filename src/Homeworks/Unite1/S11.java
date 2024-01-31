package Homeworks.Unite1;
// Population Projection
// The U.S. Census Bureau projects population based on the following assumptions:
// - One birth every 7 seconds
// - One death every 13 seconds
// - One new immigrant every 45 seconds
// Write a Java program to display the population for each of the next five years.
// Assume the current population is 312,032,486, and one year has 365 days.

// Hint: In Java, if two integers perform division, the result is an integer.
// The fractional part is truncated. For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5).
// To get an accurate result with the fractional part, one of the values involved in the division
// must be a number with a decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
public class S11 {
    public static void main(String[] args) {
        double current_population = 312032486;
        double yearly = (365d * 24 * 60 * 60 / 7) - (365d * 24 * 60 * 60 / 13) + (365d * 24 * 60 * 60 / 45);
        System.out.printf("year1: %.1f\n", (current_population + yearly));
        System.out.printf("year2: %.1f\n", (current_population + (2 * yearly)));
        System.out.printf("year3: %.1f\n", (current_population + (3 * yearly)));
        System.out.printf("year4: %.1f\n", (current_population + (4 * yearly)));
        System.out.printf("year5: %.1f\n", (current_population + (5 * yearly)));
        System.out.println(yearly);
    }
}
