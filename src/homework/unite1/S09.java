package homework.unite1;

// (Area and perimeter of a rectangle)
// Write a program that displays the area and perimeter of a rectangle with the width of 4.5 and height of 7.9
// using the following formula: area = width * height
public class S09 {
    public static void main(String[] args) {
        double width=4.5;
        double height= 7.9;
        double area= width*height;
        double perimeter= width+height;
        System.out.println("Area of rectangle: " +area);
        System.out.println("Perimeter of rectangle:" +perimeter);
    }
}
