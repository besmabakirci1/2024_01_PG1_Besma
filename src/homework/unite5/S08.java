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

/// double highestScore = Double.NEGATIVE_INFINITY;bunu anlamadım :/Diğer her şeyi yazdırmıştım ama burda tıkanınca yardım aldım
/// Biz bunu başka nasıl çözeriz ?!
// Double.NEGATIVE_INFINITY demesniin sebebi şu;
// kod ne yapıyor, sırayla student score alıyor, bu score büyük mü küçük mü diye bakacak ama bu ilk öğrenci olduğu için
// elinde karşılaştırabileceği başka student score olmadığo için
// ben diyo Double.NEGATIVE_INFINITY yani ilk değer olarak en düşük eksi sayı vereyim sonra yeni gelen öğrencilerinkini
// kolayca hesaplayayım demiş şöyle de yapabilirsin, score minimum 0 olur diyelim
// sen double highestScore=0 yazsan da olurdu
// başka bir örnek olarak, 1 den 10 a kadar olan sayıların toplamını yaparken,
// for döngüsünde toplam = toplam + i; diyoruz ya ama bunu demeden önce int toplam = 0;
// deyip ilk değeri atıyoruz ki, toplam +i derken 0+1 yapabilelim,
// aynı mantıktan ortaya çıkıyor, diğer türlü kıyaslıcak veya toplayacak bir değer yok elimizde diye