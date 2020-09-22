package Chap3;

import java.util.Random;

/**
 * Random Month
 */
// Write a program that randomly generates an integer between 1 and 12
// and displays the English month names January, Febryary, ...., December
// for the numbers 1, 2 .... 12 accordingly.

public class Exercise_03_04 {
    public static void main(String[] args) {
        //Initiate random method declares to "number"
        Random number = new Random();

        //sets int min and max to 1 and 12
        int max = 12;
        int min = 1;
        //sets random to min 1 and max 12.
        int random = min + number.nextInt((max - min) + 1);

        //souts the random number generated and +1 to match numb and switch.
        System.out.println(random + 1);

        //Switch selektion, takes random number generated
        //and souts the month matching the number.
        switch (random % 12) {
            case 0:
                System.out.println("January");
                break;
            case 1:
                System.out.println("February");
                break;
            case 2:
                System.out.println("March");
                break;
            case 3:
                System.out.println("April");
                break;
            case 4:
                System.out.println("May");
                break;
            case 5:
                System.out.println("June");
                break;
            case 6:
                System.out.println("July");
                break;
            case 7:
                System.out.println("August");
                break;
            case 8:
                System.out.println("September");
                break;
            case 9:
                System.out.println("October");
                break;
            case 10:
                System.out.println("November");
                break;
            case 11:
                System.out.println("December");

        }


    }
}
