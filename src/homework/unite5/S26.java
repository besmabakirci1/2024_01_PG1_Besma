package homework.unite5;

//(Compute e) You can approximate e using the following series:
// e = 1/1! + 1/2! + 1/3! + 1/4! + ... +  1/i!
// Write a program that displays the e value for i = 10000, 20000, ..., and 100000.
// (Hint: Because i! = i * (i - 1) * c * 2 * 1, then 1/(i!) is i * (i - 1)!
// Initialize e and item to be 1 and keep adding a new item to e.
// The new item is the previous item divided by i for i = 2, 3, 4, ....)
public class S26 {
    public static void main(String[] args) {
        double e = 1.0;
        double item = 1.0;
        for(int n = 10000; n <= 100000; n += 10000){
            for (int i = 1; i <= n; i++){
                item /= i;
                e += item;
            }
            System.out.printf("Approximation of e for i = %d: %.15f%n", n, e);
        }
    }
}
