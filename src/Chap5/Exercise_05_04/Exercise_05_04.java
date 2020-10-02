/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 02-10-2020
 */
package Chap5.Exercise_05_04;

public class Exercise_05_04 {
    public static void main(String[] args) {
        //declare vars
        double inches = 0;
        double centimeters = 0;
        String space = "  ";

        //souts header of table
        System.out.println("Inches    to   Centimeters");
        System.out.println("--------------------------");
        //while statement, computes table size and correct convertion
        //table is executed until inches is equal to 10
        while (inches <= 10) {
            centimeters = (inches * 2.54);
            System.out.println(inches + space + "      |        " + centimeters);
            inches += 1;
            //if inches is zero
            if (inches == 0.0) {
                space = " ";
            }
            //if inches is tens
            if (inches == 10.0) {
                space = " ";
            }
        }


    }
}
