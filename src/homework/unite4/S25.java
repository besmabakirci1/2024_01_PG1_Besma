package homework.unite4;
import java.util.Random;

// (Generate vehicle plate numbers)
// Assume a vehicle plate number consists of three uppercase letters followed by four digits.
// Write a program to generate a plate number.
public class S25 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("This program will generate a plate number ");

        char randomUppercaseLetter = (char) ('A' + random.nextInt(26));
        char letter1 = randomUppercaseLetter;
        char letter2 = randomUppercaseLetter;
        char letter3 = randomUppercaseLetter;

        int randomNumber = (int) Math.random() * 10 ;
        int digit1 = randomNumber;
        int digit2 = randomNumber;
        int digit3 = randomNumber;
        int digit4 = randomNumber;

        System.out.println(" " +letter1 + letter2 + letter3 + digit1 + digit2 + digit3 + digit4);
    }
}
// soru 1 : bu programda digitler ve letterlerin aynı olmasını yasaklayan herhangi bir şey yok ben ona göre yazmayacaktım değil mi ?