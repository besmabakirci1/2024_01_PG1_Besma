package Homework.Unite1;
// (Approximate π)
// π can be computed using the following formula:
// π = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
// Write a Java program that calculates and displays the result of the expression:
// 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) and
// 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)
// Use 1.0 instead of 1 in your program to represent decimal fractions.
public class S07 {
    public static void main(String[] args) {
        double result1= 4.0*(1.0 -1.0/3 +1.0/5 -1.0/7 +1.0/9 -1.0/11 );
        double result2 = (result1 + 1.0 / 13);
        System.out.println("Approximation1: "+ result1);
        System.out.println("Approximation2: "+ result2);

    }
}
