/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 01-10-2020
 */
package Chap5.Exercise_05_02;

import java.util.Scanner;

public class UserInterface {
    //prompt user method
    static void promptUser() {
        //sets ints to track questions executed
        final int NUMBER_OF_QUESTIONS = 10;
        int count = 0;

        System.out.println("\nExecuting multiplication Quiz");
        //while loop, executes code aslong as count is less than 10.
        while (count < NUMBER_OF_QUESTIONS) {
            //Souts user how many questions left in quizz
            System.out.println("Questions left: " + (NUMBER_OF_QUESTIONS - count));
            //Calls function class, executes method generatenumber 1 and 2
            //sets to number 1 and 2
            int number1 = Function.genererateNumber1();
            int number2 = Function.genererateNumber2();

            //Souts user multiplification question
            //with 2 random generated numbers
            System.out.print("\nWhat is " + number1 + " x " + number2 + ": ");
            Scanner input = new Scanner(System.in);
            //sets input to "answer"
            int answer = input.nextInt();
            //calls function class, executing computeResult method
            //expecting answer, number1 and 2
            //sets return to result
            String result = Function.computeResult(answer, number1, number2);

            //souts result
            System.out.println(result);
            count++;

        }
        //calls Function class, executes timeResult method
        //sets return to testResult and souts test result
        String testResult = Function.timeResult();
        System.out.println(testResult);
    }
}
