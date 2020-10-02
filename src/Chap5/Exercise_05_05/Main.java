/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 02-10-2020
 */
package Chap5.Exercise_05_05;

import Chap5.Exercise_05_01.UserInterface;

public class Main {
    public static void main(String[] args) {
        //Declares vars used to calculate table
        int celcius = 0;
        double fahrenheit = 0.0;
        int fahrenheitRev = 0;
        double celciusRev = 0;
        //Sets space 1
        //Printing order worked implementing another space "space2"
        String space1 = "            ";
        String space2 = "            ";
        //souts table headers
        System.out.println("CELCIUS  TO  FAHRENHEIT       | FAHRENHEIT TO CELCIUS");
        System.out.println("-----------------------------------------------------------");

        //Creates table
        while (celcius <= 100) {
            fahrenheit = (int) (1.8 * celcius) + 32;
            celciusRev = (double) (fahrenheitRev - 32) * 5 / 9;

            System.out.println(celcius + space1 + fahrenheit + space2 + " | "
                    + fahrenheitRev + space1 + celciusRev);
            celcius += 5;
            fahrenheitRev += 5;

            //If statement, when celcius hits a specific int
            //space changes.
            if (celcius == 10) {
                space1 = "           ";
            }
            if (celcius == 40) {
                space2 = "           ";
            }
            if (celcius == 100) {
                space1 = "          ";
            }
        }

    }


}

