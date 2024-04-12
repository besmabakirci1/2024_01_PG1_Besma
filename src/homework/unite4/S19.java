package homework.unite4;
import java.util.Scanner;

// (Business: check ISBN-10)
// Rewrite the Programming Exercise 3.9 by entering the ISBN number as a string.
/// Important issues from Exercise 3.9 :
// The last digit, d10, is a checksum, which is calculated from the other nine digits using the following formula:
// ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9) ) % 11
// If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention.
public class S19 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the first 9 digit of the ISBN: ");
        String firstNineDigit = input.nextLine();

        int checksum = (int) (firstNineDigit.charAt(0) + (firstNineDigit.charAt(1) * 2 ) + (firstNineDigit.charAt(2) * 3) + (firstNineDigit.charAt(3) * 4) + (firstNineDigit.charAt(4) * 5)
                + (firstNineDigit.charAt(5) * 6) + (firstNineDigit.charAt(6) * 7) + (firstNineDigit.charAt(7) * 8)+ (firstNineDigit.charAt(8) * 9) ) % 11 ;

        String ISBN = firstNineDigit;

        if (checksum == 10 ){
            ISBN += "X";
        }else{
            ISBN += checksum ;
        }
        System.out.println("The calculated ISBN: " + ISBN);
    }
}



//        Integer.parseInt(String.valueOf(lastDigit));
//        char lastDigit = input.nextLine().charAt(9); ? burda charAt(0) olması gerektiğini ve hatanın burdan kaynaklandığını iddia etti ai ama yok asla alakası olduğuna inanmıyorum
// 013031997 input olduğunda  0130319973 output oluyor bu da tamemen yanlış olmuş oluyor :/ diğer inputta da aynı şey oldu