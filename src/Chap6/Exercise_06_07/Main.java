/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 09-10-2020
 */
package Chap6.Exercise_06_07;

import java.util.Scanner;

/**
 * Financial application: compute the future investment value
 */
//Write a method that computes future investment value at a given interest rate
//for a specified number of years. The future investment is determined using the formula
//in Programming Exercise 2.21
//Use Method Header
//public static double futureInvestmenValue(double investmentAmount, double monthly InterestRate, int years)

public class Main {
    public static void main(String[] args) {
        //sets variables
        Scanner input = new Scanner(System.in);
        int years = 30;
        System.out.println("Enter investment amount in $: ");
        double investmentAmount = input.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
        double interestRate = input.nextDouble();

        //divides on both sides
        interestRate /= 1200;

        //runs futureInvestmentValue method, with inputs
        //sets return to "result"
        double result = futureInvestmentValue(investmentAmount, interestRate, years);

        //sout result
        System.out.println("Future valid in 30 years is: " + "$" + result);

    }
    //Method type double, takes 3 inputs
    //returns computed result
    public static double futureInvestmentValue(double inventmentAmount, double monthlyInterestRate, int years) {
        //computes future investment amount in 30 years
        //sets to "futureInvestment"
        double futureInvestment = inventmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

        return futureInvestment;
    }
}
