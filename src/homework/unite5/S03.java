package homework.unite5;
import java.util.Scanner;

// (Conversion from kilograms to pounds)
// Write a program that displays the following table
// (note that 1 kilogram is 2.2 pounds):
// Kilograms       Pounds
//  1               2.2
//  3               6.6
// ...
// 197              433.4
// 199              437.8

/* ~ TR. :
 (Mil’den kilometre’ye dönüştürme)
 Aşağıdaki tabloyu oluşturan bir program yazınız. (1 mil 1,609 kilometredir)
 */

public class S03 {
    public static void main(String[] args) {
        System.out.println("Kilograms    \t    Pounds");
        for(int kilogram = 1 ; kilogram <= 199; kilogram +=2 ){
            double pound = kilogram * 2.2;
            System.out.printf(" %d          \t     %.1f \n" , kilogram , pound);
        }
    }
}
