package homework.unite6;

import java.util.Scanner;

// (Sort three numbers)
// Write a method with the following header to display three numbers in increasing order:
// public static void displaySortedNumbers( double num1, double num2, double num3)
// Write a test program that prompts the user to enter three numbers and invokes the
// method to display them in increasing order.
public class S05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter num1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Please enter num2: ");
        double num2 = scanner.nextDouble();
        System.out.print("Please enter num3: ");
        double num3 = scanner.nextDouble();
        displaySortedNumbers(num1,num2,num3);
    }
    public static void displaySortedNumbers( double num1, double num2, double num3){
        if (num1 > num2 && num2 > num3){
            System.out.println(num3 + " " + num2 + " " + num1); // 321
        } else if (num2 > num1 && num1 >num3) {
            System.out.println(num3 + " " + num1 + " " + num2); // 312
        } else if (num3 > num1 && num1 > num2 ) {
            System.out.print(num2 + " " + num1 + " " + num3); // 213
        } else if (num1 > num3 && num3 > num2) {
            System.out.print(num2 + " " + num3 + " " + num1); // 231
        }else if (num3 > num2 && num2 > num1) {
            System.out.print(num1 + " " + num2 + " " +  num3); // 123
        }else if (num2 > num3 && num3 > num1) {
            System.out.print(num1 + " " + num3 + " " + num2); // 132
        }
    }
}
//        double temp;
//        if (num1 > num2) { temp = num1; num1 = num2; num2 = temp; }
//        if (num2 > num3) { temp = num2; num2 = num3; num3 = temp; }
//        if (num1 > num2) { temp = num1; num1 = num2; num2 = temp; }
//
//        System.out.println(num1 + " " + num2 + " " + num3);
//BENİM YAZDIĞIM İF ELSE YERİNE BU ÜÇ SATIRLA ÇÖZEBİLECEĞİMİZİ SAVUNUYOR.AI