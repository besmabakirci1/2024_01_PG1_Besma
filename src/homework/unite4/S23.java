package homework.unite4;
import java.util.Scanner;

//(Financial application: payroll)
// Write a program that reads the following information and prints a payroll statement:
// Employee’s name (e.g., Smith)
// Number of hours worked in a week (e.g., 10) Hourly pay rate (e.g., 9.75)
// Federal tax withholding rate (e.g., 20%) State tax withholding rate (e.g., 9%)
// A sample run is shown below:
// Enter employee's name: Smith
// Enter number of hours worked in a week: 10
// Enter hourly pay rate: 9.75
// Enter federal tax withholding rate: 0.20
// Enter state tax withholding rate: 0.09
// Employee Name: Smith
// Hours Worked: 10.0
// Pay Rate: $9.75
// Gross Pay: $97.5
// Deductions:
// Federal Withholding (20.0%): $19.5
// State Withholding (9.0%): $8.77
// Total Deduction: $28.27
//Net Pay: $69.22
public class S23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter employee's name: ");
        String employeeName = input.nextLine();
        System.out.println("Please enter number of hours worked in a week: ");
        float hoursWorkedPerWeek = input.nextFloat();
        System.out.println("Please enter hourly pay rate: ");
        float hourlyPayRate = input.nextFloat();
        System.out.println("Please enter federal tax withholding rate (e.g., 0.20 for 20%): ");
        float federalTaxWithholdingRate = input.nextFloat();
        System.out.println("Please enter state tax withholding rate (e.g., 0.09 for 9%): ");
        float stateTaxWithholdingRate = input.nextFloat();
        input.close();

        float grossPay = (hoursWorkedPerWeek * hourlyPayRate);
        float federalWithholding = grossPay * federalTaxWithholdingRate;
        float stateWithholding = grossPay * stateTaxWithholdingRate;
        float totalDeduction = federalWithholding + stateWithholding;
        float netPay = grossPay - totalDeduction;

        System.out.println("\nEmployee Name: " + employeeName);
        System.out.println("Hours Worked: " + hoursWorkedPerWeek);
        System.out.printf("Pay Rate: $%.2f\n", hourlyPayRate);
        System.out.printf("Gross Pay: $%.2f\n", grossPay);
        System.out.println("Deductions:");
        System.out.printf("Federal Withholding (%.2f%%): $%.2f\n", federalTaxWithholdingRate * 100, federalWithholding);
        System.out.printf("State Withholding (%.2f%%): $%.2f\n", stateTaxWithholdingRate * 100, stateWithholding);
        System.out.printf("Total Deduction: $%.2f\n", totalDeduction);
        System.out.printf("Net Pay: $%.2f\n", netPay);
    }
}

//HatırlatmaNotu: %% bir yüzde işareti yazdırmak için kullanılır. Örnek olarak %.2f%% format specifier'ı, federalTaxWithholdingRate * 100 değerini "%20.00" şeklinde biçimlendirir.
// Soru ben bu kodu run ettiğimde State Withholding (9.00%): $8.78 , Total Deduction: $28.28 , Net Pay: $69.23 olarak çıkıyor ordaki 0.01 neden farklı oldu output olarak ?
// float, big decimal kullanabilirsin ayrıntılı hesaplarda:)