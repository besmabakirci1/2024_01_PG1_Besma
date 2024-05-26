package homework.unite5;

// (Financial application: find the sales amount)
// You have just started a sales job in a department store. Your pay consists of a base salary and a commission.
// The base salary is $5,000.
// The scheme shown below is used to determine the commission rate.
//    Sales Amount                 Commission Rate
// -----------------------------------------------------
//   $0.01–$5,000                     8 percent
//   $5,000.01–$10,000               10 percent
//   $10,000.01 and above            12 percent
// Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the next $5000 is at 10%,
// and the rest is at 12%.
// If the sales amount is 25,000, the commission is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.
// Your goal is to earn $30,000 a year.
// Write a program that finds the minimum sales you have to generate in order to make $30,000.
public class S39 {
    public static void main(String[] args) {

        double baseSalary = 5000;
        double targetIncome = 30000;
        double commissionTarget = targetIncome - baseSalary;

        double commissionRate1 = 0.08;
        double commissionRate2 = 0.10;
        double commissionRate3 = 0.12;

        double totalCommission = 0;
        double salesAmount = 0;

        for (salesAmount = 0.01; totalCommission < commissionTarget; salesAmount += 0.01) {
            totalCommission = 0;

            double firstTierSales = Math.min(salesAmount, 5000);
            totalCommission += firstTierSales * commissionRate1;

            if (salesAmount > 5000) {
                double secondTierSales = Math.min(salesAmount - 5000, 5000);
                totalCommission += secondTierSales * commissionRate2;
            }

            if (salesAmount > 10000) {
                double thirdTierSales = salesAmount - 10000;
                totalCommission += thirdTierSales * commissionRate3;
            }
        }

        System.out.printf("Minimum sales required to generate $30,000 is: $%.2f\n", salesAmount);

    }
}
