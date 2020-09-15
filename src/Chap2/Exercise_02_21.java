package Chap2;
// Write a program that reads in investment amount, annual interest rate, and number of years
// and display the future investment.

import java.util.Scanner;

public class Exercise_02_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //souts for user inputs, anmount, interest rate and years.
        System.out.println("Enter investment amount in $: ");
        double amount = input.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
        double interestRate = input.nextDouble();
        //operater for divition on both sides
        interestRate /= 1200;
        System.out.println("Enter number of years: ");
        double years = input.nextDouble();

        //computes future investment amount and sets to variable
        double futureInvestmentValue = amount * Math.pow(1 + interestRate, years * 12);
        //sots answer
        System.out.println("Future valid is: " +"$" + futureInvestmentValue);


    }
}
