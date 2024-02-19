package chapter2;

import java.util.Scanner;

public class KonsoldanBisilerOkumak {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.println("Herhangi bir sayi girer misiniz? ");
        double klavyedenAlinanDeger = klavye.nextDouble();

        System.out.println("Ben bugun konsoldan bunu okudum: " + klavyedenAlinanDeger);
    }
}
