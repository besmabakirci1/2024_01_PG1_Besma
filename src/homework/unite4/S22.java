package homework.unite4;
import java.util.Scanner;

// (Check substring)
// Write a program that prompts the user to enter two strings and
// reports whether the second string is a substring of the first string
// Enter string s1: ABCD-> "Enter"
// Enter string s2: BC-> "Enter"
// BC is a substring of ABCD.
// Enter string s1: ABCD-> "Enter"
// Enter string s2: BDC-> "Enter"
// BDC is not a substring of ABCD
public class S22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter string s1: ");
        String s1= input.nextLine();
        System.out.println("Please enter string s2: ");
        String s2= input.nextLine();
        if (s1.contains(s2)){
            System.out.println(s2 + " is a substring of " + s1);
        }else System.out.println(s2 + " is not a substring of " + s1);
    }
}
