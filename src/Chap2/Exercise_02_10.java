package Chap2;
// (Science: calculating energi) Write a proogram that calculates energy needed to heat water from
// an iinitial temperature to a final temperature.
// Your program should prompt the user to enter the amount of water in kilograms and the initial and final temperatures of the water.
// The formula to compute the energy is:
// Q = M * (finalTemperature - initialTemperature) * 4184
import java.util.Scanner;

public class Exercise_02_10 {
    public static void main(String[] args) {
        //set Scanner to input
        Scanner input = new Scanner(System.in);
        //souts for user input
        System.out.print("Enter the amount of water in kilograms: ");
        double M = input.nextDouble(); //sets input to be M
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();

        //sets amount of water (Q) to be the computed.
        double Q = M * (finalTemperature - initialTemperature) * 4184;
        //souts answers
        System.out.println("The energy needed is: " + Q);
    }
}
