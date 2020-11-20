/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 20-11-2020
 */
package Chap11.Exercise_11_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String out = "\"The largest number in the input is: ";
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        //Prompting user to enter a number sequence
        System.out.println("Enter a sequence of numbers, ending with 0");
        Integer numb = input.nextInt();
        while (numb.intValue() != 0) {
            list.add(numb);
            numb = input.nextInt();
        }
        //Calling MaxArrayElementArrayList class executes max method
        //Setting return result to max.
        Integer max = MaxArrayElementArrayList.max(list);
        System.out.println(out + max);
    }

}
