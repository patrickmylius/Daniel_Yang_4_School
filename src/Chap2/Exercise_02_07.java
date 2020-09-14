package Chap2;
// (Find the number of years) Write a program that prompts the user to enter
// the minutes (e.g., 1 billion), and displays the number of years and remaining days for the minutes.
// For simplicity, assume that a year has 365 days.

import java.util.Scanner;

public class Exercise_02_07 {
    public static void main(String[] args) {
        //sets Scanner to input
        Scanner input = new Scanner(System.in);
        //souts user to enter an an integer minutes
        System.out.println("Enter number of minutes: ");
        //sets console input to "minutes"
        int minutes = input.nextInt();

        //sets years to be, minutes divided with minutes a year
        int years = minutes / 525600;
        //sets remainingMinute to be, minutes modulus minutes a year
        int remainingMinutes = minutes % 525600;
        //sets days to be, remainingMinutes divided with minutes a day
        int days = remainingMinutes / 1440;
        //souts answer
        System.out.println(minutes + " minutes is approximately " + years + " and " + days);
    }
}
