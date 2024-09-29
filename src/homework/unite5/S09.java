package homework.unite5;
import java.util.Scanner;

// (Find the two highest scores)
// Write a program that prompts the user to enter the number of students and each student’s name and score,
// and finally displays the student with the highest score and the student with the second-highest score.
/* ~ TR. :
(En yüksek iki puanı bulma)
Kullanıcıdan toplam öğrenci sayısını  ve her öğrencinin adı ve puanını alan,
 bunun ardından en yüksek ve en yüksek ikinci puana sahip öğrencilerin adını ve puanını gösteren bir program yazınız.
 */
public class S09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of students, each student's name and score: ");
        int numberOfStudent , score  = input.nextInt();
        input.nextLine();
        int highestScore1 , highestScore2, count  = 0 ;

        String name, firstWinner = "" , secondWinner = "" , result;


    }
}
/*

        int numberOfStudents, score, highestScore = 0, secondHighestScore = 0, count = 0;

        System.out.print("Enter the number of students: ");
        numberOfStudents = scan.nextInt(); // input => 4
        scan.nextLine();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the name of student: ");
            name = scan.nextLine();

            System.out.print("Enter this student's score: ");
            score = scan.nextInt();

            scan.nextLine();

            count++;

            // inputs => 70, 80, 90, 60

            if (count > 1) {
                if (score > highestScore) {
                    highestScore = score;
                    firstWinner = name;
                } else if (score > secondHighestScore) {
                    secondHighestScore = score;
                    secondWinner = name;
                }
            } else {
                firstWinner = name;
                highestScore = score;
            }
        }

        result = (count > 1) ? "Name of the student with the highest score: " + firstWinner + "=> " + highestScore
                + "\nName of the student with the second highest score: " + secondWinner + "=> " + secondHighestScore :
                "Name of the student with the highest score: " + firstWinner + "=> " + highestScore;

        System.out.println(result);
*/