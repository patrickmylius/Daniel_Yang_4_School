/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 09-10-2020
 */
package Chap6.Exercise_06_05;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;

public class Function {
    public static double[] displaySortedNumber(double[] numbers) {
        //sorts numbers

        /** For some reason, i cant find a way to sort
         * from high to low, Arrays.sort(numbers, Collections.reverseOrder());
         * doesnt work, asks for T[]...*/

        //sorts doubles low - high
        Arrays.sort(numbers);
        double sortedNumbers[] = swap(numbers);


        //return sorted doubles
        return sortedNumbers;
    }
    //method added, to print numbers from high to low.
    //method takes double array, returns double array
    public static double[] swap(double[] numbers){
        //swaps values, array posis 0 and 2
        double temp = numbers[0];
        numbers[0] = numbers[2];
        numbers[2] = temp;

        return numbers;
    }
}
