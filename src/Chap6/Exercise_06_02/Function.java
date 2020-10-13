/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 09-10-2020
 */
package Chap6.Exercise_06_02;

public class Function {
    //Method computing sum of digits
    public static int sumDigits(long n) {
        //Select this if 2 digits input
        if (n >= 0 && n <= 99) {
            long tens = n % 10;
            n /= 10;
            long hundreds = n % 10;
            n /= 10;
            //Computes sum and typeCast it to int "sumInt"
            long sum = tens + hundreds;
            int sumInt = (int) sum;
            return sumInt;
        }
        //Select this if 3 digits input
        if (n >= 100 && n <= 999) {
            long belowTens = n % 10;
            n /= 10;
            long tens = n % 10;
            n /= 10;
            long hundreds = n % 10;
            n /= 10;
            //Computes sum and typeCast it to int "sumInt"
            long sum = belowTens + tens + hundreds;
            int sumInt = (int) sum;
            return sumInt;
        }
        //Select this if 4 digits input
        if (n >= 1000 && n <= 9999) {
            long belowTens = n % 10;
            n /= 10;
            long tens = n % 10;
            n /= 10;
            long hundreds = n % 10;
            n /= 10;
            long thousands = n % 10;
            n /= 10;
            //Computes sum and typeCast it to int "sumInt"
            long sum = belowTens + tens + hundreds + thousands;
            int sumInt = (int) sum;
            return sumInt;

        } else return 0;
    }
}
