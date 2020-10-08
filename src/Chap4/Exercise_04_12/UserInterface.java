/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 08-10-2020
 */
package Chap4.Exercise_04_12;

import java.util.Scanner;

public class UserInterface {

    static void promptUser() {
        //declares variables, Strings, Ints and scanner
        String binResult = "The binary value is: ";
        String prompt = "Enter a hex digit: ";
        int decNumb, i = 1, j;
        int binnum[] = new int[100];
        Scanner input = new Scanner(System.in);

        //sets inpout to "hexDecnumb"
        System.out.println(prompt);
        String hexDecnumb = input.nextLine();

        //Calls function class, executes hex2deci method
        //sets return to "decNumb"
        decNumb = Function.hex2deci(hexDecnumb);

        //Executes while loop
        while (decNumb != 0) {
            binnum[i++] = decNumb % 2;
            decNumb = decNumb / 2;
        }
        //souts results "j"
        System.out.println(binResult);
        for (j = i - 1; j > 0; j--) {
            System.out.println(binnum[j]);
        }

    }

}
