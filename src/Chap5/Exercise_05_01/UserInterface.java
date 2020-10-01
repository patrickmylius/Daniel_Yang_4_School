/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 01-10-2020
 */
package Chap5.Exercise_05_01;
import java.util.Scanner;

public class UserInterface {

    static void promptUser() {
        Scanner input = new Scanner(System.in);
        //prompt user for input
        System.out.print("Enter your score: ");
        //sets user input to "score"
        int score = input.nextInt();
        //Calls Function class, executes passOrFail method
        //computes with user input
        //Sets return to "examResult"
        String examResult = Function.passOrFail(score);
        //souts examResult
        System.out.println(examResult);

    }
}
