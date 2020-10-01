/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 01-10-2020
 */
package Chap5.Exercise_05_02;

import java.util.Random;
//Function class, holds methods and variables.
public class Function {
    static Random random = new Random();
    static long startTime = System.currentTimeMillis();
    static int correctCount = 0;

    static int number1;
    static int number2;

    static String output = "";
    static String correct = "You are correct!";

    //method creating random number1 between 0-12
    static int genererateNumber1() {
        number1 = random.nextInt(12);
        return number1;
    }
    //method creating random number2 between 0-12
    static int genererateNumber2() {
        number2 = random.nextInt(12);
        return number2;
    }
    //Method returning results
    //Expecting user input "answer", numb1 and numb2, originally generated in methods above
    static String computeResult(int answer, int numb1, int numb2) {
        if (numb1 * numb2 == answer) {
            correctCount++;
            return correct;
        } else {
            output += "\n" + numb1 + " * " + numb2 + "=" + answer + ((numb1 * numb2 == answer) ? " correct" : " wrong");
            String wrong = "Your answer is wrong.\n" + numb1 + " * " + numb2 + " should be " + (numb1 * numb2);
            return wrong;
        }
    }
    //Method stopping testtime, and returns in seconds.
    static String timeResult() {
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        return "Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " second\n" + output;
    }


}