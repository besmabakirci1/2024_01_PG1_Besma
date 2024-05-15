package homework.unite5;

// (Display the ASCII character table)
// Write a program that prints the characters in the ASCII character table from ! to ~.
// Display ten characters per line. The ASCII table is shown in Appendix B.
// Characters are separated by exactly one space
// https://drive.google.com/file/d/1AKYepnfee9GwNTJOIuUEWkNckjWw-KHZ/view?usp=drive_link
public class S15 {
    public static void main(String[] args) {
        char start = '!' ;
        char end = '~' ;
        int count = 1;
        int charactersPerLine = 10;
        for (char ch = start; ch <= end; ch++){
            System.out.print(ch + " ");
            count ++;
            if (count % charactersPerLine == 0) {
                System.out.println();
            }
        }
    }
}
