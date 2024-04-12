package homework.unite3;
import java.util.Scanner;

// (Financial: compare costs)
// Suppose you shop for rice in two different packages. You would like to write a program to compare the cost.
// The program prompts the user to enter the weight and price of each package and displays the one with the better price.
// Here is a sample run:
// Enter weight and price for package 1: 50 24.59-> "Enter"
// Enter weight and price for package 2: 25 11.99-> "Enter"
// Package 2 has a better price.
// Enter weight and price for package 1: 50 25-> "Enter"
// Enter weight and price for package 2: 25 12.5-> "Enter"
// Two packages have the same price.
public class S33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the weight and the price of first package: ");
        double weightPackage1 = input.nextDouble();
        double pricePackage1 = input.nextDouble();
        System.out.println("Please enter the weight and the price of second package:");
        double weightPackage2 = input.nextDouble();
        double pricePackage2 = input.nextDouble();

        double Package1 = pricePackage1 / weightPackage1 ;
        double Package2 = pricePackage2 / weightPackage2;

        if(Package2 == Package1){
            System.out.println("Two packages have the same price.");
        }else if (Package2 > Package1) {
            System.out.println("Package 1 has a better price.");
        }else System.out.println("Package 2 has a better price.");
    }
}
