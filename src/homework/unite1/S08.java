package homework.unite1;

// (Area and perimeter of a circle)
// Write a program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formula:
// perimeter = 2 * radius * p
// area = radius * radius * p
public class S08 {
    public static void main(String[] args) {
        double radius=5.5;
        double perimeter= 2 *radius *Math.PI;
        double area= radius *radius *Math.PI;
        System.out.println("Perimeter of circle: "+ perimeter);
        System.out.println("Area of circle: "+ radius);
    }
}
