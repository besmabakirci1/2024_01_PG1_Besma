package homework.unite5;
import java.util.Scanner;

// (Find the highest score)
// Write a program that prompts the user to enter the number of students and each student’s name and score,
// and finally displays the name of the student with the highest score.

public class S08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of students:");
        int numberOfStudents = input.nextInt();

        String highestScoringStudent = "";
        double highestScore = Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("Please enter student " + i + "'s name:");
            String studentName = input.next();

            System.out.println("Please enter student " + i + "'s score:");
            double studentScore = input.nextDouble();

            if (studentScore > highestScore) {
                highestScore = studentScore;
                highestScoringStudent = studentName;
            }
        }
        input.close();

        System.out.println("The student with the highest score is: " + highestScoringStudent);
    }
}

// double highestScore = Double.NEGATIVE_INFINITY;  bunu anlamadım :/Diğer her şeyi yazdırmıştım ama burda tıkanınca yardım aldım