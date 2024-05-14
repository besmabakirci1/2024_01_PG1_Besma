package homework.unite5;

// (Find the largest n such that Math.pow(n,3) < 12,000)
// Use a while loop to find the largest integer n such that n^3 is less than 12,000.
public class S13 {
    public static void main(String[] args) {
        double n = 1;
        while (Math.pow(n,3) < 12000){
            n++;
        }
        System.out.println("The largest integer n such that n^3 is less than 12,000 is: " + (int) n);
    }
}
