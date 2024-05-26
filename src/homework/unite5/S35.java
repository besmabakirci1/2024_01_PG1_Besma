package homework.unite5;

// (Summation) Write a program to compute the following summation.
// 1 / (1 + √2) + 1 / (√2 + √3) +  1 / (√3 + √4) + ... +  1 / (√624 + √625)
public class S35 {
    public static void main(String[] args) {
        double sum = 0 ;
        for (int i = 1; i <= 624 ; i++){
            sum +=  1/ (Math.sqrt(i) + Math.sqrt(i+1));
        }
        System.out.println(sum);
    }
}
