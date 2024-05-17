package homework.unite5;

// (Display prime numbers between 2 and 1,000)
// Modify Listing 5.15 to display all the prime numbers between 2 and 1,000, inclusive.
// Display eight prime numbers per line. Numbers are separated by exactly one space.

// Listing 5.15:
// final int NUMBER_OF_PRIMES = 50; /// Number of primes to display final
// int NUMBER_OF_PRIMES_PER_LINE = 10; /// Display 10 per line
// int count = 0; /// Count the number of prime numbers
// int number = 2; /// A number to be tested for primeness
// System.out.println("The first 50 prime numbers are \n");
// Repeatedly find prime numbers
// while (count < NUMBER_OF_PRIMES) {
    /// Assume the number is prime
// boolean isPrime = true; /// Is the current number prime?
//  /// Test whether number is prime
//  for (int divisor = 2; divisor <= number / 2; divisor++) {
//  if (number % divisor == 0) { // If true, number is not prime
//  isPrime = false; // Set isPrime to false
//  break; // Exit the for loop
//  }
//}
// Display the prime number and increase the count
// if (isPrime) {
//  count++; // Increase the count
//  if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
/// Display the number and advance to the new line
// System.out.println(number);
// } else{
//  System.out.print(number + " ");
//}
// // Check if the next number is prime
// number++;
//}


///5.11 Case Study: Displaying Prime Numbers 189
public class S20 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 1000;
        int NUMBER_OF_PRIMES_PER_LINE = 8;
        int count = 0;
        int number = 2;
        System.out.println("The prime numbers between 2 and 1,000 are: ");
        while (count < NUMBER_OF_PRIMES){
            boolean isPrime = true;
            for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.printf("%-5d\n", number);
                } else {
                    System.out.printf("%-5d ", number);
                }
            }
            number++;
        }
    }
}
