package Chap3;

import java.util.Scanner;
import java.util.Random;

/**
 * Game: heads or tailts
 */
// Write a program that lets the user guess wether the flip of a coin results in heads or tails.
// The program randomly generates an integer 0 or 1, which represents head or tail.
// The program prompts the user to enter a guess, and reports whether the guess is correct or incorrect.
public class Exercise_03_14 {
    //Start
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        //declare strings tail and head
        String tail = "tail";
        String head = "head";
        //sets random min and max to be 0-1
        int max = 1;
        int min = 0;
        //declares random
        int random = min + number.nextInt((max - min) + 1);


        //prompts user for guess (tail or head)
        System.out.print("Coin flips, you may chose head or tail: ");
        String guess = input.next();

        //If selektion, to check wether users guess matches string
        // and the random generated [0-1]
        if (guess.equalsIgnoreCase(tail) && random == 1) {
            System.out.println("Tail, congratulations you won!");
        } else if (guess.equalsIgnoreCase(head) && random == 0) {
            System.out.println("Head, congratulations you won!");
        } else System.out.println("Uhh! Wrong guess, try again: ");

    }
}