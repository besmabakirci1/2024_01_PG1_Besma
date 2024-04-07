package homework.unite3;
import java.util.Scanner;

// (Geometry: point position)
// Given a directed line from point p0(x0, y0) to p1(x1, y1),
// you can use the following condition to decide whether a point p2(x2, y2) is
// on the left of the line,on the right, or on the same line
// (see Figure 3.11):
// (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0) > 0 then p2 is on the left side of the line
// (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0) = 0 then p2 is on the same side of the line
// (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0) < 0 then p2 is on the right side of the line
// Write a program that prompts the user to enter the three points for p0, p1, and p2 and displays
// whether p2 is on the left of the line from p0 to p1, on the right, or on the same line.
// Here are some sample runs:

// Enter three points for p0, p1, and p2: 4.4 2 6.5 9.5 -5 4-> "Enter"
// (-5.0, 4.0) is on the left side of the line from (4.4, 2.0) to (6.5, 9.5)

// Enter three points for p0, p1, and p2: 1 1 5 5 2 2-> "Enter"
// (2.0, 2.0) is on the line from (1.0, 1.0) to (5.0, 5.0)

// Enter three points for p0, p1, and p2: 3.4 2 6.5 9.5 5 2.5-> "Enter"
// (5.0, 2.5) is on the right side of the line from (3.4, 2.0) to (6.5, 9.5)
public class S32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three points for p0(x0, y0), p1(x1, y1), and p2(x2, y2): ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        input.close();

        double condition = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        if (condition > 0){
            System.out.println("(\" + x2 + \", \" + y2 + \") is on the left side of the line from (\" + x0 + \", \" + y0 + \") to (\" + x1 + \", \" + y1 + \")");
        } else if (condition == 0) {
            System.out.println("(\" + x2 + \", \" + y2 + \") is on the same side of the line from (\" + x0 + \", \" + y0 + \") to (\" + x1 + \", \" + y1 + \")");
        } else if (condition < 0 ){
            System.out.println(("(\" + x2 + \", \" + y2 + \") is on the right side of the line from (\" + x0 + \", \" + y0 + \") to (\" + x1 + \", \" + y1 + \")"));
        }
    }
}
