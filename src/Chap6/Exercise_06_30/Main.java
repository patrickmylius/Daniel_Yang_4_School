/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 09-10-2020
 */
package Chap6.Exercise_06_30;

import java.util.Random;

/**
 * Game: craps
 */
//Write a program to play a variation of the game, as follows.
//Roll two dice. Each dice has six faces, representing values 1,2, ..., and 6
//respectively. Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps)
//you lose: if the sum is 7 or 11 (called natural), you win; if the sum is another value
//blablablabla to much text
public class Main {

    public static void main(String[] args) {

        //For loop running method until losers point are hit
        for (int i = 0; i <= 100; i++) {
            System.out.println("Roll the dices!");
            //Runs rollDice method, sets return to int "points"
            int point = rollDice();
            //Runs gameResult method, sets return to String "result"
            String result = gameResult(point);
            //souts result
            System.out.println(result);
            //If statement, breaks if losersPoint are rolled.
            if (point == 3 || point == 2 || point == 12) {
                System.exit(0);
            }
        }
    }

    //Method that generate two random rolls
    //Max bounds set to 6 pr. dice
    //returns total point
    public static int rollDice() {
        Random randomNumb = new Random();
        int dice1 = randomNumb.nextInt(6) + 1;
        int dice2 = randomNumb.nextInt(6) + 1;

        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));

        int point = dice1 + dice2;

        return point;
    }

    //Method that computes if points results in a win or lose
    //Contains if statements to check points
    //Returns String win or lose.
    public static String gameResult(int point) {
        if (point == 7 || point == 11) {
            String win = "You win!\n";
            return win;

        } else if (point == 2 || point == 3 || point == 12) {
            String lose = "You loose!\n";
            return lose;
        } else {
            String natural = "You win\n";
            return natural;
        }
    }

}
