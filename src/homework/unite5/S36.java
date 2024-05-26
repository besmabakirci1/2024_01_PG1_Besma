package homework.unite5;
import java.util.Scanner;

// (Business application: checking ISBN) Use loops to simplify Programming
// Exercise 3.9.
//// Here are sample runs:
//// Enter the first 9 digits of an ISBN as integer: 013601267 -> "Enter"
//// he ISBN-10 number is 0136012671
//// Enter the first 9 digits of an ISBN as integer: 013031997 -> "Enter"
//// The ISBN-10 number is 013031997X

public class S36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first 9 digits of the ISBN as integers:");
        int sum = 0;
        String isbnInput = input.nextLine();
        String isbn = isbnInput;
        for (int i = 0; i < 9; i++) {
            int digit = Character.getNumericValue(isbnInput.charAt(i));
            sum += digit * (i + 1);
        }

        int d10 = sum % 11;

        if (d10 == 10) {
            isbn += 'X';
        } else {
            isbn += d10;
        }
        System.out.println("The ISBN-10 number is " + isbn);
        input.close();
    }
}

/*

    for (int i = 1; i <= 9; i++) {
            int digit = input.nextInt();
            isbn += digit;
            sum += digit * i;
        }
        yazıp yalnızca String isbn = "" ; yazdığımızda her digit sonrası enter yapmak zorunda kalıyordum o yüzden
        Character.getNumericValue(isbnInput.charAt(i)) charAt () metodu ile i indeksindeki karakteri alıp ve değerini bulup stringi o şekilde kullanmak daha verimli oldu

 */