/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 05-10-2020
 */
package Chap5.Exercise_05_06;

public class Function {
    static String computeHighestScore(String[] nameArray, int scoreArray[]) {
        int highScore = 0;
        int highScore = Integer.MAX_VALUE;

        for (int i = 0; i < scoreArray.length ; i++) {
        if (scoreArray(i) > highScore) {
            highScore = score;
            highScoreName = name[i];
        }
        String outResult = highScoreName + highScore;
        return outResult;
    }

}

