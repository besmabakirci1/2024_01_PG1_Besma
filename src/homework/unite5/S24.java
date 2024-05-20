package homework.unite5;

// (Sum a series)
// Write a program to sum the following series:
// 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99
public class S24 {
    public static void main(String[] args) {
        double sum = 0;
        for(int i = 1; i <= 95; i += 2){
            sum += (double) i / (i+2);
        }
        System.out.println("Sum: " + sum);
    }
}
