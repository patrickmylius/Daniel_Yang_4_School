package Chap2;
// (Convert meters into feet) Write a program that reads a number n meters,
// converts it to feet, and displays the result. One meter is 3.2786

import java.util.Scanner;

public class Exercise_02_03 {
    public static void main(String[] args) {
        //declare scanner and name it input
        Scanner input = new Scanner(System.in);
        //souts for user input
        System.out.println("Enter a value for meter: ");
        //sets user input to meter
        double meter = input.nextDouble();
        //sets feet to meter * 3.2786(feet pr. meter)
        double feet = meter * 3.2786;
        //souts the convertion of meter to feet
        System.out.println(meter + " "+ "meters is" + " " + feet + " " + "feet");
    }
}
