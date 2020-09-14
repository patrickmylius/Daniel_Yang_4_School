package Chap2;
// (Convert mile to kilometer) Write a rogram that reads a mile in a double value from the console,
// converts it to kilometers,
// and display the result. The forumula for the conversion is as follows:
// 1 mile = 1.6 kilometers

import java.util.Scanner;

public class Exercise_02_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles do you want to convert?: ");
        //takes user input from console and sets miles
        double miles = input.nextDouble();
        //Takes scanner input, multiply with 1.6, then declares the result to double kilometers.
        double kilometers = miles * 1.6;
        //Prints the converted kilometers in console
        System.out.println(miles + " " + "miles" + " " + " = " + kilometers + " " + "kilometers");
    }
}
