package homework.unite3;

// (Sort three integers)
// Write a program that prompts the user to enter three integers and display the integers in non-decreasing order.

import java.util.Scanner;

public class S08{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        int minimumNumber, middleNumber, maximumNumber;
        System.out.println("Please enter three integers respectively");
        System.out.print("integer1: ");
        int integer1 = input.nextInt();
        System.out.print("integer2: ");
        int integer2 = input.nextInt();
        System.out.print("integer3: ");
        int integer3 = input.nextInt();
        input.close();

        if (integer1 <= integer2 && integer1 <= integer3) {
            minimumNumber = integer1;
        } else if (integer2 <= integer1 && integer2 <= integer3) {
            minimumNumber = integer2;
        } else {
            minimumNumber = integer2;
        }
        System.out.println("The minimum number is: " + minimumNumber);

        if (integer1 > integer2 && integer1 > integer3){
            maximumNumber = integer1;
        } else if (integer2 > integer1 && integer2 >integer3) {
            maximumNumber = integer2;
        } else {
            maximumNumber = integer3;
        }
        System.out.println("The maximum number is: " + maximumNumber);

        middleNumber = integer1 + integer2 + integer3 - maximumNumber - minimumNumber;
        System.out.println("The middle number is:" + middleNumber);

        System.out.println("The integers in non-decreasing order are: " + minimumNumber + ", " + middleNumber + ", " + maximumNumber);
    }
}
