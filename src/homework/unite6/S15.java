package homework.unite6;

// (Financial application: print a tax table)
// Listing 3.5 gives a program to compute tax.
// Write a method for computing tax using the following header:
// public static double computeTax(int status, double taxableIncome)
// Use this method to write a program that prints a tax table
// for taxable income from $50,000 to $60,000 with intervals of $50 for all the following statuses:

//   Taxable          Single        Married Joint           Married             Head of
//   Income                         or Qualifying           Separate            a House
//                                  Widow(er)
// ----------------------------------------------------------------------------------------
//   50000             8688          6665                    8688                7353
//   50050             8700          6673                    8700                7365
//   ...
//   59950            11175          8158                   11175                9840
//   60000            11188          8165                   11188                9853
//
// Hint: round the tax into integers using Math.round
// (i.e., Math .round(computeTax(status, taxableIncome)).
public class S15 {
}
