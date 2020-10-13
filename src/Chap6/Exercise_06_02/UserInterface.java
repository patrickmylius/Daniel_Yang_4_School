/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 09-10-2020
 */
package Chap6.Exercise_06_02;

import java.util.Scanner;

//Class holding promptUser method
public class UserInterface {

    //Method prompting user for digits input
    static void promptUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter digits: ");
        long digits = input.nextInt();

        //Calls Function class execute sumDigits method with input
        //sets sum to result
        int result = Function.sumDigits(digits);

        //souts result
        System.out.println(result);


    }
}
