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
        System.out.println("Kilograms  \t \t   Pounds  |  \t  Pounds  \t \t   Kilograms");

        while (true)
        {
            for (int kilograms = 1; kilograms <= 199; kilograms += 2) {
                double pound = kilograms * 2.2;
                System.out.printf("%-3d     \t \t     %.1f   | \n", kilograms, pound);
            }

            for (double pound = 20; pound <= 515; pound += 5) {
                 double kilograms = pound * 0.4545;
                System.out.printf("%.1f   \t \t    %-5.2f \n", pound, kilograms);
            }
            break;
        }
    }
}
// yan yana nasıl yazdıracağımı çözemedim