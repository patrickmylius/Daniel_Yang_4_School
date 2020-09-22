package Chap3;

import java.util.Scanner;

/**
 * (Even or odd number)
 */
// Write a program that prompts the user to enter an integer
// and displays whether the integer is an odd number or not.

public class Exercise_03_35 {
    //Start
    public static void main(String[] args) {
        //Runs userInterface method, added fori loop to let user prompt 5 times.
        for (int i = 0; i < 5; i++) {
            userInterface();
        }
    }

    //Interface method obtaining variables and runs evenOrOdd method
    static void userInterface() {
        //prompt user to enter an integer
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        //sets input to variable int "number"
        int number = input.nextInt();

        //Calls computed number in evenOrOdd method and sets to String "result"
        String result = evenOrOdd(number);
        //Prints computed number result
        System.out.println(result);
    }

    //evenOrOdd method, computing with selektions if the number input is even or odd. returns number + string
    static String evenOrOdd(int number) {
        if (number % 2 == 0) {
            return (number + ": is an even number");
        } else {
            return (number + ": is an odd number");
        }
    }
}