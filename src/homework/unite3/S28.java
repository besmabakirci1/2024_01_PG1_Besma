package homework.unite3;

//(Geometry: two rectangles)
// Write a program that prompts the user to enter the center x-, y-coordinates, width, and height of two rectangles
// and determines whether the second rectangle is inside the first or overlaps with the first, as shown in Figure 3.9.
// Test your program to cover all cases.
//Here are the sample runs:

// Enter r1's center x-, y-coordinates, width, and height: 2.5 4 2.5 43-> "Enter"
// Enter r2's center x-, y-coordinates, width, and height: 1.5 5 0.5 3-> "Enter"
// r2 is inside r1

// Enter r1's center x-, y-coordinates, width, and height: 1 2 3 5.5-> "Enter"
// Enter r2's center x-, y-coordinates, width, and height: 3 4 4.5 5-> "Enter"
// r2 overlaps r1

// Enter r1's center x-, y-coordinates, width, and height: 1 2 3 3-> "Enter"
// Enter r2's center x-, y-coordinates, width, and height: 40 45 3 2 -> "Enter"
// r2 does not overlap r1

import java.util.Scanner;

public class S28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter r1's center x-, y-coordinates, width, and height:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();

        System.out.println("Enter r2's center x-, y-coordinates, width, and height:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();
        
       /* if (width1 >= width2 && height1 >= height2 && x1>x2 && y1 >y2 ){
            System.out.println("r2 is inside r1");
            } else if (width2 >= width1 && height2 >= height1 && x2>x1 && y2 >y1 ) {
            System.out.println("r2 overlaps r1");
        }else System.out.println("r2 does not overlap r1");*/

        if	((Math.pow(Math.pow(y2 - y1, 2), .05) + height2 / 2 <= height1 / 2) &&
                (Math.pow(Math.pow(x2 - x1, 2), .05) + width2 / 2 <= width1 / 2) &&
                (height1 / 2 + height2 / 2 <= height1) &&
                (width1 / 2 + width2 / 2 <= width1))
            System.out.println("r2 is inside r1");
        else if ((x1 + width1 / 2 > x2 - width2) ||
                (y1 + height1 / 2 > y2 - height2))
            System.out.println("r2 overlaps r1");
        else
            System.out.println("r2 does not overlap r1");
    }
}


