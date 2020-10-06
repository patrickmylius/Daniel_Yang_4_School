/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 05-10-2020
 */
package Chap5.Exercise_05_08;

public class Function {
    static int computeHighestScore( int score[]) {
        int highScore = score[0];

        for (int i = 0; i < score.length; i++) {
            if (score[i] > highScore) {
                highScore = score[i];

            }
        }
        return highScore;
    }
    //static String findStudent(String name[]) {
    //    String student = name[0];
    //}

}