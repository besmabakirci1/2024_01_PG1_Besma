package homework.unite4;
import java.util.Random;

//(Random character)
// Write a program that displays a random uppercase letter using the Math.random() method.
public class S16 {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(26);
        char uppercaseLetter = (char) (randomNumber + 65);

        System.out.println(uppercaseLetter);
    }
}