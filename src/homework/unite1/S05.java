package homework.unite1;
// (Compute expressions)
// Write a program that displays the result of (9.5 * 4.5 - 2.5 * 3)/ (45.5 - 3.5)
public class S05 {
    public static void main(String[] args) {
        double result1 = (9.5 * 4.5) - (2.5 * 3);
        double result2 = 45.5 - 3.5;
        double result = (result1/result2);
        System.out.println("Result: " +result);
    }
}
