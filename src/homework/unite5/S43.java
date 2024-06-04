package homework.unite5;

// (Math: combinations)
// Write a program that displays all possible combinations for picking two numbers from integers 1 to 7.
// Also display the total number of all combinations.
// 1    2
// 1    3
// ... ...
// The total number of all combinations is 21
//  C (n,r)= n!/ (( n-r)!.r !)
// C(7,2) = 21 => 7 * 6 / 2

public class S43 {
    public static void main(String[] args) {
        int totalCombinations = 0;

        for (int i = 1; i <= 7; i++) {
            for (int j = i + 1; j <= 7; j++) {
                System.out.println(i + "    " + j);
                totalCombinations++;
            }
        }

        System.out.println("The total number of all combinations is " + totalCombinations);
    }
}

/* böyle çözmek yanlış !..
        int min = 1;
        int max = 7;
        while ( min != max){
            for (int i = min ; i < max ; i++ ){
                for (int j = max; j <= 2 ; j-- ){
                    System.out.print(i + "" + j + "\n");
                }
            }
        }
 */