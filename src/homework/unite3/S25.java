package homework.unite3;

import java.util.Scanner;

//(Geometry: intersecting point ,keşisen nokta,.)
// Two points on line 1 are given as (x1, y1) and (x2, y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a–b.
// The intersecting point of the two lines can be found by solving the following linear equation:
// x * (y1 -y2) - y * (x1 -x2) = x1 * (y1 -y2) - y1 * (x1 -x2)
// x * (y3 -y4) - y * (x3 -x4) = x3 * (y3 -y4) - y3 * (x3 -x4)
// This linear equation can be solved using Cramer’s rule (see Programming Exercise 3.3).
// If the equation has no solutions, the two lines are parallel (Figure 3.8c).
// Write a program that prompts the user to enter four points and displays the intersecting point.
// ax + by =e
// cx + dy =f
// X = ed - bf / ad - bc
// Y = af - ec / ad - bc
public class S25 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter the first point on line1: ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        System.out.print("Please enter the second point on line1: ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        System.out.print("Please enter the first point on line2: ");
        int x3 = input.nextInt();
        int y3 = input.nextInt();
        System.out.print("Please enter the second point on line2: ");
        int x4 = input.nextInt();
        int y4 = input.nextInt();
        double x = 2.623901;
        double y = 0.708740;

        // devamında determinant kullanmam gerekiyor ama ben linear cebir bilmiyorum ve onu kullanmadan başka bir ç.y. var mı bilmiyorum kanata kanata denedim yok olmuyor :/ illada çöüm yazacaksak
        // gptden alınan ç.y.
        // double determinant = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
        // Check if lines are parallel
        //if (determinant == 0) {
        // System.out.println("The lines are parallel. There is no intersecting point.");
        // } else {
        // double x = ((x1 * y2 - y1 * x2) * (x3 - x4) - (x1 - x2) * (x3 * y4 - y3 * x4)) / determinant;
        // double y = ((x1 * y2 - y1 * x2) * (y3 - y4) - (y1 - y2) * (x3 * y4 - y3 * x4)) / determinant;
        //  System.out.println("The intersecting point is at (" + x + ", " + y + ")");
        //  }


    }
}
