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
 * Check substring
 */
//Write a program that prompts the user to enter two strings
//and reports whether the second string is a substring
//of the first string

public class Exercise_04_22 {
    public static void main(String[] args) {
        //Declares scanner to "input"
        Scanner input = new Scanner(System.in);
        //Prompts user for string 1 and string 2
        //Declares them to s1 and s2
        System.out.print("Enter a string s1: ");
        String s1 = input.next();
        System.out.print("Enter a string s2: ");
        String s2 = input.next();

        //If statement, checks wether s1 contains letters from s2
        if (s1.contains(s2)) {
            System.out.println(s2 + " " + "is a substring of " + s1);
        }


    }
}
