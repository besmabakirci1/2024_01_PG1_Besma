package homework.unite5;
import java.util.Scanner;

// (Count positive and negative numbers and compute the average of numbers)
// Write a program that reads an unspecified number of integers,
// determines how many positive and negative values have been read,
// and computes the total and average of the input values (not counting zeros).
// Your program ends with the input 0. Display the average as a floating-point number.
// Here is a sample run:
// Enter an integer, the input ends if it is 0: 1 2 -1 3 0 -> "Enter"
// The number of positives is 3
// The number of negatives is 1
// The total is 5.0
// The average is 1.25
// Enter an integer, the input ends if it is 0: 0 -> "Enter"
// No numbers are entered except 0

/*
 ~ TR. :
 (Negatif ve pozitif sayıları sayma ve sayıların ortalamasını hesaplama)
 Kullanıcının istediği kadar tam sayı girebileceği, girilen sayıların kaç tanesi negatif,
 kaç tanesi pozitif , toplamı ve ortalamasını hesaplayan bir program yazınız.
 Eğer 0 değeri girilirse program sonlanacaktır.
 Ortalama değerini gerçel sayı olarak gösteriniz.
 Örnek akışı inceleyiniz:
 Bir tam sayı giriniz. 0 girilirse sonlanır: 1   2  -1  3  0
 Girilen pozitif sayılarin adedi:  3
 Girilen negatif sayılarin adedi:  1
 Sayılarin toplamı:  5.0
 Sayılarin ortalaması: 1.25
 Bir tam sayı giriniz. 0 girilirse sonlanır: 0
 0 hariç hiçbir sayı girilmemistir.
 */

public class S01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the integers: ");

        int positiveCount = 0;
        int negativeCount = 0;
        int sum = 0;
        int number ;

        while ((number = input.nextInt()) != 0){
            if (number > 0){
                positiveCount ++;
            } else if (number < 0) {
                negativeCount ++;
            }
            sum += number;
        }

        if (positiveCount + negativeCount > 0) {
            double average = (double) sum / (positiveCount + negativeCount);
            System.out.println("The number of positives is " + positiveCount);
            System.out.println("The number of negatives is " + negativeCount);
            System.out.println("The total is " + sum);
            System.out.println("The average is " + average);
        } else {
            System.out.println("No numbers are entered except 0");
        }
    }
}

