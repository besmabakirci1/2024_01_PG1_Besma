package homework.unite5;
import java.util.Scanner;

// (Business application: checking ISBN) Use loops to simplify Programming
// Exercise 3.9.
//Scanner input = new Scanner (System.in);
//        System.out.println("Please enter the first 9 digit of the ISBN as integers");
//        int d1 = input.nextInt(), d2 = input.nextInt(), d3 = input.nextInt(),
//            d4 = input.nextInt(), d5 = input.nextInt(), d6 = input.nextInt(),
//            d7 = input.nextInt(), d8 = input.nextInt(), d9 = input.nextInt();
//        int d10 = ( (d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9) ) % 11 ;
//        String isbn = String.format("%d%d%d%d%d%d%d%d", d1, d2, d3, d4, d5, d6, d7, d8, d9);
//
//        if (d10 == 10 ){
//            isbn += "X";
//        }else
//            isbn += d10;
//
//        System.out.println("The ISBN-10 number is " + isbn);

public class S36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first 9 digits of the ISBN as integers:");
        int sum = 0;
        String isbn = "";

        for (int i = 1; i <= 9; i++) {
            int digit = input.nextInt();
            isbn += digit;
            sum += digit * i;
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

//          Scanner input = new Scanner (System.in);
//        System.out.println("Please enter the first 9 digit of the ISBN as integers");
//
//
//        int d10 = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11;
//
//        ;
//        for (; String isbn = String.format("%d%d%d%d%d%d%d%d", d1, d2, d3, d4, d5, d6, d7, d8, d9) ; ){
//
//        }
//        if (d10 == 10 ){
//            isbn += "X";
//        }else
//            isbn += d10;
//
//        System.out.println("The ISBN-10 number is " + isbn);
