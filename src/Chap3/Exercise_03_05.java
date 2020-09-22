package Chap3;

import java.util.Scanner;

/**
 * Find future dates
 */
// Write a program that prompts the user to enter an integer for today's day of the week
// (Sunday is 0, Monday is 1,...., and Saturday is 6)
// Also prompt the user to enter the number of days after today for a future day and display the future day of the week.

public class Exercise_03_05 {
    //Start
    public static void main(String[] args) {
        start(); //Start method that runs variables and starts findToday method + findFutureDay method.

    }

    //Method start
    static void start() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day and days elapsed from today: ");

        int today = input.nextInt();
        int elapse = input.nextInt();
        int elapsedDay = today + elapse;

        while (today < 0 || today > 6) {
            System.out.println("Input out of bounds, must be between 0 - 6");
            System.out.println("Please try again.");
            today = input.nextInt();

        }
        findToday(today);
        findFutureDay(elapsedDay);
    }

    //findToday method with switch selektion
    static void findToday(int today) {
        switch (today % 7) {
            case 0:
                System.out.println("Today is Sunday");
                break;
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednessday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
        }
    }

    //find future day of today method, with switch selektion
    static void findFutureDay(int elapsedDay) {
        switch (elapsedDay % 7) {
            case 0:
                System.out.println("Future day is Sunday");
                break;
            case 1:
                System.out.println("Future day is Monday");
                break;
            case 2:
                System.out.println("Future day is Tuesday");
                break;
            case 3:
                System.out.println("Future day is Wednessday");
                break;
            case 4:
                System.out.println("Future day is Thursday");
                break;
            case 5:
                System.out.println("Future day is Friday");
                break;
            case 6:
                System.out.println("Future day is Saturday");
        }
    }

}

