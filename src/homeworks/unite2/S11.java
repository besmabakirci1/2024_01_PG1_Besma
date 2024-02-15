package Homeworks.Unite2;

import java.util.Scanner;

//(Population projection)
// Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years and displays the population after the number of years.
//Use the hint in Programming Exercise 1.11 for this program. The population should be cast into an integer.
// Here is a sample run of the program:
//Enter the number of years: 5-> "Enter"
//The population in 5 years is 325932970
public class S11 {
    public static void main(String[] args) {
        System.out.println("Please enter the number of years: ");
        Scanner input = new Scanner(System.in);
        int Years = input.nextInt();
        input.close();

        int Current_Population = 312032486;
        int Yearly_Increase = (int) (((365d * 24 * 60 * 60 / 7) - (365d * 24 * 60 * 60 / 13) + (365d * 24 * 60 * 60 / 45)) * Years);
        int Total_Population = Current_Population + Yearly_Increase;

        System.out.println("The population in " + Years + " years is " + Total_Population);
    }
}
