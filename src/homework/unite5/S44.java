package homework.unite5;
import java.util.Scanner;

// (Computer architecture: bit-level operations)
// A short value is stored in 16 bits. Write a program that prompts the user to enter a short integer
// and displays the 16 bits for the integer.
// Here are sample runs:
// Enter an integer: 5-> "Enter"
// The bits are 0000000000000101
// Enter an integer: -5-> "Enter"
// The bits are 1111111111111011
//(Hint: You need to use the bitwise right shift operator (>>) and the bitwise AND operator (&),
// which are covered in Appendix G, Bitwise Operations.)
public class S44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a short integer: ");
        short number = scanner.nextShort();
        String bits = "";
        for (int i = 15 ; i >= 0 ; i--){
            bits += (number >> i) & 1 ;
        }
        System.out.println("The bits are " + bits);
    }
}


// for (int i = 15; i >= 0; i--): Bu döngü, 15'ten başlayarak 0'a kadar olan sayıları geriye doğru sayar.
// Burada `i`, bit pozisyonunu temsil eder. `short` türündeki bir sayı Java'da 16 bit olduğu için,
// en yüksek bit 15. bit olarak kabul edilir ve en düşük bit 0. bit olarak kabul edilir.
// bits += (number >> i) & 1;`: Bu satır iki işlemi birleştirir:
//   - `(number >> i)`: Sayıyı (`number`) sağa doğru `i` bit kaydırır.
//   Bu, `number` değişkeninin `i`'nci bitini en sağa (0'ıncı pozisyona) getirir.
//   - `& 1`: Bit düzeyinde AND işlemi yapar.
//   Yani kaydırılmış sayının en sağ biti ile 1'in bit düzeyinde AND işlemi yapılır.
//   Eğer kaydırılmış sayının en sağ biti 1 ise sonuç 1 olur, değilse sonuç 0 olur.
//   Bu şekilde, `number` değişkeninin her bir biti sırayla kontrol edilir ve `bits` stringine eklenir.
// System.out.println("The bits are " + bits); : En sonunda, oluşturulan bit dizisi ekrana "The bits are " metni ile birlikte yazdırılır.
// Bu kod, girilen `short` türündeki sayının bitlerini tek tek kontrol ederek, sayının 16 bitlik ikili temsilini
// bir string olarak oluşturur ve ekrana yazdırır. Böylece, kullanıcının girdiği sayının bilgisayarın hafızasında
// nasıl saklandığını görsel olarak görebiliriz.