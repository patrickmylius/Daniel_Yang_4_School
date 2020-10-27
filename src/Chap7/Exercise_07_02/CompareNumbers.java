/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 25-10-2020
 */
package Chap7.Exercise_07_02;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        //declare arrays integers and numbers
        int integers[] = new int[11];
        int numbers[] = new int[integers.length];

        //Prompt user to enter 11 numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 11 numbers: ");

        //add 11 ints to number array
        for (int i = 0; i < integers.length; i++) {
            numbers[i] = input.nextInt();
        }
        //Execute compareNumbers method
        compareNumbers(numbers, integers);

    }
    //compareNumbers method, taking array numbers and array integers
    //runs if statements 11 times
    //if condition pass, sout the [i] numbers value compared to the 11 number.
    public static void compareNumbers(int[] numbers, int[] integers) {
        for (int i = 0; i < integers.length; i++) {
            if (numbers[i] < numbers[10])
                System.out.println("The number: " + numbers[i] + " is smaller than " + numbers[10]);
            else if (numbers[i] == numbers[10])
                System.out.println("The number: " + numbers[i] + " is equal to " + numbers[10]);
            else
                System.out.println("The number: " + numbers[i] + " is greater than " + numbers[10]);
        }
    }
}
