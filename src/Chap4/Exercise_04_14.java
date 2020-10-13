/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 06-10-2020
 */
package Chap4;

import java.util.Scanner;

/**
 * Conver letter grade to number
 */
//Write a program that prompts the user to enter
//a letter grade A, B, C, D, or F and displays
//its corresponding numeric value 4, 3, 2, 1, or 0.
// For other input, display invalid grade.

public class Exercise_04_14 {
    public static void main(String[] args) {
        //Declares scanner to input
        Scanner input = new Scanner(System.in);

        //Fori loop, executes code 3 times
        for (int i = 0; i < 3; i++) {
            //prompts for user input
            System.out.print("Enter a letter grade: ");
            String letter = input.next();
            //sets String out
            String out = "The numeric grade for ";

            //runs input through switch statement.
            //Souts result
            switch (letter.toLowerCase()) {
                case "a":
                    System.out.println(out + "A is 4");
                    break;
                case "b":
                    System.out.println(out + "B is 3");
                    break;
                case "c":
                    System.out.println(out + "C is 2");
                    break;
                case "d":
                    System.out.println(out + "D is 1");
                    break;
                case "f":
                    System.out.println(out + "F is 0");
            }

        }


    }
}
