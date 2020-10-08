/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 08-10-2020
 */
package Chap4.Exercise_04_12;

public class Function {

    //Method returning deci number from hex input
    static int hex2deci(String hex) {
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int value = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            value = 16 * value + d;
        }
        return value;
    }
}
