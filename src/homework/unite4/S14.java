package homework.unite4;
import java.util.Scanner;

// (Convert letter grade to number)
// Write a program that prompts the user to enter
// a letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2, 1, or 0.
// Here is a sample run:
// Enter a letter grade: B-> "Enter"
// The numeric value for grade B is 3
// Enter a letter grade: T-> "Enter"
// T is an invalid grade
public class S14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter grade: ");
        String userInput = input.next();

        char letterGrade = userInput.toUpperCase().charAt(0);
        int numericValue = -1 ; // 0 girmek istiyordum ama karışıklık olmasın diye :/

        if (letterGrade == 'A'||letterGrade == 'B'|| letterGrade == 'C'||letterGrade ==  'D'||letterGrade ==  'F' ){
            switch (letterGrade){
                case 'A':
                    numericValue = 4;
                    break;
                case 'B':
                    numericValue = 3;
                    break;
                case 'C':
                    numericValue = 2;
                    break;
                case 'D':
                    numericValue = 1;
                    break;
                case 'F':
                    numericValue = 0;
                    break;
            } 
            System.out.println("The numeric value for grade " + letterGrade + " is " + numericValue);
        }else System.out.println(letterGrade + " is an invalid grade");
    }
}
