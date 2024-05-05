package homework.unite1;

 //(Print a table)
// Write a program that displays the following table:
// a a^2 a^3
// 1 1 1
// 2 4 8
// 3 9 27
// 4 16 64
public class S04 {
    public static void main(String[] args) {
        System.out.println("a \ta^2 \ta^3");
        for(int a= 1; a<= 4;a++){
            System.out.println(a + "\t" + Math.pow(a,2) + "  \t" + Math.pow(a,3));
        }
    }
}
