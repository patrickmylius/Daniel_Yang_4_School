/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 01-10-2020
 */
package Chap5.Exercise_05_01;

/**
 * Pass or fail
 */
//Write a program that prompts a student to enter a Java score.
//If the score is greater or equal to 60, display "you pass the exam";
//otherwise, display "you don't pass the exam.
//Your program ends with input -1.

public class Main {
    //Start
    public static void main(String[] args) {
        //for i loop, calls Userinter face class and executes promptUser method 3 times 
        for (int i = 0; i < 3; i++) {
            UserInterface.promptUser();

        }

    }
}
