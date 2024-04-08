package homework.unite4;
import java.util.Scanner;

// (Student major and status)
// Write a program that prompts the user to enter two characters and displays the major and status represented in the characters.
// The first character indicates the major and the second is number character 1, 2, 3, 4,
// which indicates whether a student is a freshman, sophomore, junior, or senior.
// Suppose the following chracters are used to denote the majors:
// M: Mathematics
// C: Computer Science
// I: Information Technology
// Here is a sample run:
// Enter two characters: M1-> "Enter"
// Mathematics Freshman
// Enter two characters: C3-> "Enter"
// Computer Science Junior
// Enter two characters: T3-> "Enter"
// Invalid input
public class S18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two characters: ");
        char major = input.next().charAt(0);
        char status = input.next().charAt(0);
        String majorName = "", statusName = "";
        if (major == 'M' || major == 'C' || major == 'I' || major == 'm' || major == 'c' || major == 'i'
                && status >= '1' && status <= '4'){

            switch (major){
                case 'M':
                case 'm':
                    majorName = "Mathematics";
                    break;
                case 'C':
                case 'c':
                    majorName = "Computer Science";
                    break;
                case 'I':
                case 'i':
                    majorName = "Information Technology";
                    break;
            }
            switch (status){
                case '1':
                    statusName = "Freshman";
                    break;
                case '2':
                    statusName = "Sophomore";
                    break;
                case '3':
                    statusName = "Junior";
                    break;
                case '4':
                    statusName = "Senior";
                    break;
            }
            System.out.print(majorName + " " + statusName);
        }else System.out.println("Invalid input ");
    }
}
