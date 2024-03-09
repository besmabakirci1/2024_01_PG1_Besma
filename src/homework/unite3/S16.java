package homework.unite3;

// (Random point)
// Write a program that displays a random coordinate in a rectangle.
// The rectangle is centered at (0, 0) with width 100 and height 200.
public class S16{
    public static void main(String[] args) {
        int width = (int)((Math.random() * 100) );
        int height = (int)((Math.random() * 200) );

        System.out.println("Random coordinate in rectangle centered at (0,0)");
        System.out.println("with width 100 and height 200: (" + width + ", " + height + ")");
    }
}