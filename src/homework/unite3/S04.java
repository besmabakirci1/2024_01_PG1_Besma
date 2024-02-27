package homework.unite3;

import java.util.Random;

// (Random month)
// Write a program that randomly generates an integer
// between 1 and 12 and displays the English month name January, February, ..., December for the number 1, 2, ..., 12, accordingly.
public class S04 {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt(12) + 1;

        if (x == 1){
            System.out.print("January");
        }
        else if (x == 2){
            System.out.print("February");
        }
        else if (x == 3){
            System.out.print("March");
        }
        else if (x == 4){
            System.out.print("April");
        }
        else if (x == 5){
            System.out.print("May");
        }
        else if (x == 6){
            System.out.print("June");
        }
        else if (x == 7){
            System.out.print("July");
        }
        else if (x == 8){
            System.out.print("August");
        }
        else if (x == 9){
            System.out.print("September");
        }
        else if (x == 10) {
            System.out.print("October");
        }
        else if (x == 11) {
            System.out.print("November");
        }
        else if (x == 12) {
            System.out.print("December");
        }
        System.out.println(x);
    }
}
