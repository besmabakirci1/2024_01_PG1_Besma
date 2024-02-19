package chapter2;

public class ComputeArea {
    public static void main(String[] args) {

        // Assign a radius
        double radius = 20; // New value is radius

        // Compute area
        double area = radius * radius * 3.14159;

        String str = """
                hdfjshldf
                dkfhkjdshk
                djfhkjdsfhs dsfhsdjkdfh ksdhfjdshf sdlfkl
                """;

        // Display results
        System.out.println("The area for the circle of radius " +
                radius + " is " + area);

    }
}
