package Chap2;
// Write a program that prompts the user to input a
// weight in pounds and a height in inches and displays the BMI

import java.util.Scanner;

public class Exercise_02_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //souts user to input weight and height in pounds
        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double inches = input.nextDouble();
        //sets value of kilograms and meters
        double kilograms = pounds * 0.45359237;
        double meters = inches * 0.0254;
        //computes BMI with
        double BMI = kilograms / Math.pow(meters, 2);
        //souts answer
        System.out.println(BMI);
    }
}
