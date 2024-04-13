package homework.unite5;
import java.util.Scanner;

// (Repeat additions)
// Listing 5.4, SubtractionQuizLoop.java, generates five random subtraction questions.
// Revise the program to generate ten random addition questions for two integers between 1 and 15.
// Display the correct count and test time.
public class S02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_QUESTIONS = 10;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";

        while (count < NUMBER_OF_QUESTIONS) {
            int number1 = (int) ((Math.random()) * 15) + 1;
            int number2 = (int) ((Math.random()) * 15) + 1;

            System.out.println("What is " + number1 + " + " + number2 + "? ");
            int answer = input.nextInt();

            if (number1 + number2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            }else {
                System.out.println("Your answer is wrong.\n" + number1 + " + " + number2 + " should be " + (number1 + number2));
            }
            count++;

            long endTime = System.currentTimeMillis();
            long testTime = endTime - startTime;

            System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
        }
    }
}
