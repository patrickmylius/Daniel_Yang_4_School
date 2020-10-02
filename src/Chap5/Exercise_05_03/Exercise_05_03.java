/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 01-10-2020
 */
package Chap5.Exercise_05_03;

import java.util.Scanner;

public class Exercise_05_03 {
    public static void main(String[] args) {
        //declare vars
        int celcius = 0;
        int fahrenheit = 0;
        String space = "  ";

        //souts header of table
        System.out.println("CELCIUS  TO  FAHRENHEIT");
        //while statement
        //computing table size and correct convertion
        //table is executed until celcius is equal to 100
        while (celcius <= 100) {
            fahrenheit = (int) (1.8 * celcius) + 32;
            System.out.println(celcius + space + "      |      " + fahrenheit);
            celcius += 5;
            //if celcius is tens, set space
            if (celcius == 10) {
                space = " ";
            }
            //if celcius is hundreds, remove space
            if (celcius == 100) {
                space = "";
            }
        }
    }
}


