/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 25-10-2020
 */
package Chap7.Exercise_07_09;


import java.util.Arrays;
import java.util.Scanner;

/*********************************************************************************
 * (Find the largest element) Write a method that finds the largets element in  *
 * an array of double values using the following header:                          *
 * public static double min(double[] array)                                       *
 * Write a test program that prompts the user to enter ten numbers, invokes this  *
 * method to return the maximum value, and displays the maximum value.            *
 *********************************************************************************/

public class LargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declare array of length 10
        double[] numbers = new double[10];

        //Prompt user to enter 10 numbers, sets to array
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        //souts method max returned result
        System.out.println("The maximum value: " + max(numbers));
    }

    //method max, finding the highest value array
    public static double max(double[] array) {
        //The highest value
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
