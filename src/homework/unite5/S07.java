package homework.unite5;

// (Financial application: compute future tuition)
// Suppose that the tuition for a university is $10,000 this year and increases 5% every year.
// In one year, the tuition will be $10,500. Write a program that computes the tuition in ten years
// and the total cost of four years’ worth of tuition after the tenth year.
public class S07 {
    public static void main(String[] args) {
        double tuition = 10000;
        int year = 1;
        for (year = 1 ; year <= 10 ; year ++){
             tuition *= 1 + (0.05);
            System.out.println("The tuition in year " + year + " will be $" + tuition);
        }

        double totalCost = 0;
        for(year = 10 ; year < 14 ; year ++){
            tuition *= 1 + (0.05);
            totalCost += tuition;
        }

        System.out.println("The total cost of four years' worth of tuition after the tenth year is $" + totalCost);
    }
}
