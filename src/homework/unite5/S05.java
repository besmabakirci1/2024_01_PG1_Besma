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
        System.out.println("Kilograms   \t \t     Pounds  | Pounds  \t \t     Kilograms");

            for (int kilogram = 1; kilogram <= 199; kilogram += 2) {
                double pound1stTable = kilogram * 2.2;

                System.out.printf("%-3d     \t    \t     %.1f     |   ", kilogram, pound1stTable);

                double pound2ndTable = 20 + ((kilogram - 1) / 2) * 5;
                double kilograms = pound2ndTable / 2.2;

                System.out.printf("%-5.2f     \t    \t  %.2f\n", pound2ndTable, kilograms );
            }
        }
    }

// not bu pound2nd table formulunu yazarjen kafam çok karıştı.
