package homework.unite5;

// (Find numbers divisible by 5 and 6)
// Write a program that displays all the numbers from 100 to 1,000, ten per line, that are divisible by 5 and 6.
// Numbers are separated by exactly one space.
/* ~ TR. :
(5 ve 6’ya bölünebilen sayıları bulma)
100’den 1000’e kadar olan sayılardan 5 ve 6’ya tam olarak bölünebilen sayıları her satırda 10 sayı olacak ve sayılar arasında birer boşluk olacak şekilde gösteren bir program yazınız.
 */
public class S10 {
    public static void main(String[] args) {
        System.out.println("This program will display the numbers which are divisible by 5 and 6 from 100 to 1000: ");
        int count = 0;
        for(int i = 100; i <= 1000 ; i++ ){
            if(i % 5 == 0 && i % 6 ==0 ){
                System.out.print(i + "");
                count ++ ;
            }
            if(count == 10){
                System.out.println();
                count = 0;
            }
        }
    }
}
