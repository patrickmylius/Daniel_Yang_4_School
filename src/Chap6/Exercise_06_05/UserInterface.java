/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 09-10-2020
 */
package Chap6.Exercise_06_05;

import java.util.*;

public class UserInterface {
    //PromptUser method
    static void promptUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers\n");
        //prompts user to enter 3 numbers
        System.out.print("Enter number 1: ");
        double num1 = input.nextDouble();
        System.out.print("Enter number 2: ");
        double num2 = input.nextDouble();
        System.out.print("Enter number 3: ");
        double num3 = input.nextDouble();
        //sets input in array "numbers"
        double[] numbers = {num1, num2, num3};
        //Calls function class, executes displaySortedNumber method
        //sets return to result
        double[] result = Function.displaySortedNumber(numbers);

        //souts arrays as a string
        System.out.printf(" The result : %s", Arrays.toString(result));

    }
}
