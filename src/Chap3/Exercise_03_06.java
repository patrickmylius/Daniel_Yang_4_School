package Chap3;

import java.util.Scanner;

/** Health application: BMI */
// Revise listing 3.4, ComputeAndInterpretBMI.java,
// to let the user enter weight, feet and inches.
// For example, if a person is 5 feet and 10 inches,
// you will enter 5 for feet and 10 for inches.

public class Exercise_03_06 {
    public static void main(String[] args) {
        //Calls userinterface method
        userInterface();

    }
    //User interface method, contains Scanner prompt, variables and souts
    //calling compue method
    static void userInterface(){

        System.out.print("Enter weight in pounds: ");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        String resultat = compute(pounds, feet, inches);
        System.out.println(resultat);


    }
    //Math method, using variables from the UserInterface class and computes BMI
    //Returns BMI sout + either of the String out, depending on BMI.
    static String compute(double pounds, double feet, double inches){
        String out1 = "Underweight";
        String out2 = "Normal";
        String out3 = "Overweight";
        String out4 = "Obese";

        double feetToInches = feet * 12;
        double totalInches = feetToInches + inches;


        //sets value of kilograms and meters
        double kilograms = pounds * 0.45359237;
        double meters = totalInches * 0.0254;
        //computes BMI with
        double BMI = kilograms / Math.pow(meters, 2);

        System.out.println("BMI IS: " + BMI);
        if (BMI < 18.5){
            return out1;
        }
        else if (BMI < 25){
            return out2;
        }
        else if (BMI < 30){
            return out3;
        }
        else return out4;
    }
}