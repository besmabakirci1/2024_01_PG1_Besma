package homework.unite5;

//(Simulation: heads or tails)
// Write a program that simulates flipping a coin one million times and displays the number of heads and tails.
public class S40 {
    public static void main(String[] args) {
        int tailsNumber = 0 ; // yazı
        int headsNumber = 0 ; // tura
        int totalFlipping = 1000000;
        for (int i = 0; i < totalFlipping; i++) {
            int coin = (int) (Math.random() * 2);
            if (coin == 0){
                tailsNumber++ ;
            }else {
                headsNumber++ ;
            }
        }
        System.out.println("Number of Tails: " + tailsNumber);
        System.out.println("Number of Head: " + headsNumber);
    }
}
