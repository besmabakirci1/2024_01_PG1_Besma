package homework.unite5;

// (Find numbers divisible by 5 or 6, but not both)
// Write a program that displays all the numbers from 100 to 200, ten per line, that are divisible by 5 or 6,
// but not both. Numbers are separated by exactly one space.
public class S11 {
    public static void main(String[] args) {
        int count =0;
        for (int i = 100 ; i <= 200 ; i++){
            if ((i % 5 == 0 || i % 6 == 0 ) && !(i % 5 == 0 && i % 6 ==0 )){
                System.out.print(i + "");
                count ++ ;
            }
            if (count == 10){
                System.out.println();
                count = 0;
            }
        }
    }
}
