package Chap2;
// Write a program that promts the user to enter monthly amount of saving
// then displays the the account value after the sixth month.

import java.util.Scanner;

public class Exercise_02_13 {
    public static void main(String[] args) {

        //souts user for amount of money input
        System.out.print("Enter the monthly saving amount: ");
        Scanner input = new Scanner(System.in);

        //sets variable doubles
        double amount = input.nextDouble();
        double monthlyInterestRate = 0.0375 / 12;
        double oneMonth = amount * (1 + monthlyInterestRate);
        double twoMonths = (amount + oneMonth) * (1 + monthlyInterestRate);
        double threeMonths = (amount + twoMonths) * (1 + monthlyInterestRate);
        double fourMonths = (amount + threeMonths) * (1 + monthlyInterestRate);
        double fiveMonths = (amount + fourMonths) * (1 + monthlyInterestRate);
        double sixMonths = (amount + fiveMonths) * (1 + monthlyInterestRate);
        //creates array, that holds 6 diff months, 1 string, 1 double.
        String arr[] = {"one: " + oneMonth, "two: " + twoMonths, "three: " + threeMonths, "four: " + fourMonths, "five: " + fiveMonths, "sixth: " + sixMonths};
        for (String str : arr) {
            //souts 6 times.
            System.out.println("Value after month " + str);
        }


    }
}