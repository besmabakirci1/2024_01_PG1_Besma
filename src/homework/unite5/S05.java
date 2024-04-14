package homework.unite5;

// (Conversion from kilograms to pounds and pounds to kilograms)
// Write a program that displays the following two tables side by side:
// Kilograms      Pounds | Pounds       Kilograms
// 1               2.2   |  20             9.09
// 3               6.6   |  25            11.36
// ...
// 197             433.4 |  510           231.82
// 199             437.8 |  515           234.09

public class S05 {
    public static void main(String[] args) {
        System.out.println("Kilograms   \t   Pounds | Pounds    \t   Kilograms");
        int kilograms = 1;
        double pounds = 20;
        while (kilograms <= 199 || pounds <= 515){
            double poundsFromKg = kilograms * 2.2;
            double kilogramsFromPounds = pounds * 0.4545;
            String leftTable = (kilograms <= 199) ? String.format("%d \t %.1f", kilograms, poundsFromKg) : "    \t   ";
            String rightTable = (pounds <= 515) ? String.format("%.1f \t %.2f", pounds, kilogramsFromPounds) : "     \t   ";
            System.out.printf("%-15s | %s\n", leftTable, rightTable);
            if (kilograms <= 199) kilograms += 2;
            if (pounds <= 515) pounds += 5;
        }


    }
}


/*for (int kilograms = 1; kilograms <= 199; kilograms++){
            double pounds = kilograms * 2.2;
            System.out.printf("%d \t %.1f \n", kilograms , pounds);
        }

        for (double pounds = 20 ; pounds <= 515 ; pounds++ ){
            double kilograms = pounds * 0.4545;
            System.out.printf("%d \t %.1f \n", pounds , kilograms);
        } */
