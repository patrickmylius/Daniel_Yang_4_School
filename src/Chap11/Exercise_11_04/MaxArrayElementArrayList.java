/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 20-11-2020
 */
package Chap11.Exercise_11_04;

import java.util.ArrayList;

public class MaxArrayElementArrayList {

    public static Integer max(ArrayList<Integer> list) {
        if (list.size() == 0)
            return null;

        int MaxValue = list.get(0); //Takes first index as maxValue
        int indexOfMaxValue = -1; // returns -1 if all elements are equal

        for (int i = 0; i < list.size(); i++) {
            //If current value is less that max value
            if (list.get(i) > MaxValue)
                MaxValue = list.get(i); //Place it in max value

        }
        return MaxValue;
    }
}
