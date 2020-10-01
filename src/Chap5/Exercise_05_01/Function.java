/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 01-10-2020
 */
package Chap5.Exercise_05_01;

public class Function {

    static String passOrFail(int score) {
        //Sets 3 strings
        String pass = "You pass the exam.";
        String fail = "You don't pass the exam.";
        String belowZero = "No numbers are entered except 0";
        //if statement, checking user input
        //returns string
        if (score >= 60) {
            return pass;
        } else if (score < 0) {
            return belowZero;
        } else return fail;
    }
}
