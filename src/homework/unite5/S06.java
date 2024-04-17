package homework.unite5;

//(Conversion from miles to kilometers) Write a program that displays the following two tables side by side:
//Miles       Kilometers  |  Kilometers       Miles
// 1            1.609     |   20              12.430
// 2            3.218     |   25              15.538
// ...
// 9            14.481    |   60              37.290
// 10           16.090    |   65              40.398
public class S06 {
    public static void main(String[] args) {
        System.out.println("Miles       Kilometers  | Kilometers      Miles");
        for (int mile = 1; mile <= 10; mile++) {
            double kilometer1stTable = mile * 1.609;
            double kilometer2ndTable = (mile * 5) + 15;
            double miles = kilometer2ndTable / 1.609;

            System.out.printf("%2d    \t       %5.3f    |  %2.0f   \t \t  %5.3f\n", mile, kilometer1stTable, kilometer2ndTable, miles);
        }
    }
}
